package fr.wcs.blablawild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import fr.wcs.blablawild.adapter.TripResultAdapter;
import fr.wcs.blablawild.model.TripResultModel;

import static fr.wcs.blablawild.R.layout;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_itinerary_list);

        Intent intent = getIntent();
        String activityTitle = intent.getStringExtra(ItinerarySearchActivity.FROM) + " >> "
                + intent.getStringExtra(ItinerarySearchActivity.TO);

        setTitle(activityTitle);

        //peupler la liste
        ListView listTrip = findViewById(R.id.itResultList);
        ArrayList<TripResultModel> results = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat(TripResultAdapter.DD_MM_YYYY_MM_HH);

        try {
            results.add(new TripResultModel("Eric", "Cartman", sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripResultModel("Stan", "Marsh", sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripResultModel("Kenny", "Broflovski", sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripResultModel("Kyle", "McCormick", sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        TripResultAdapter adapter = new TripResultAdapter(this, results);
        listTrip.setAdapter(adapter);

    }
}
