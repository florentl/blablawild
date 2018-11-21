package fr.wcs.blablawild;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ItinerarySearchActivity extends AppCompatActivity {

    public static final String FROM = "from";
    public static final String TO = "to";
    public static final String DATE = "date";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);
        final Context context = getApplicationContext();
        final ItinerarySearchActivity searchActivity = this;
        View searchBtn = findViewById(R.id.searchLaunchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final EditText fromInput = findViewById(R.id.fromInput);
                final EditText toInput = findViewById(R.id.toInput);
                final EditText dateInput = findViewById(R.id.dateInput);

                String fromValue = fromInput.getText().toString();
                String toValue = toInput.getText().toString();
                if("".equals(fromValue) || "".equals(toValue)) {
                    String msg = context.getString(R.string.search_mandatory_fields);
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, msg, duration);
                    toast.show();
                } else {
                    Intent intent = new Intent(searchActivity, ItineraryListActivity.class);
                    intent.putExtra(FROM, fromValue);
                    intent.putExtra(TO, toValue);
                    intent.putExtra(DATE,dateInput.getText().toString());
                    startActivity(intent);
                }
            }
        });

        //date picker
        final Calendar myCalendar = Calendar.getInstance();
        final EditText dateTxt= findViewById(R.id.dateInput);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "dd/MM/yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.FRANCE);
                dateTxt.setText(sdf.format(myCalendar.getTime()));
            }
        };

        dateTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(ItinerarySearchActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

    }


}
