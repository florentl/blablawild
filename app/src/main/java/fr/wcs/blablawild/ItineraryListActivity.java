package fr.wcs.blablawild;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import fr.wcs.blablawild.adapter.TripResultAdapter;
import fr.wcs.blablawild.model.SearchModel;
import fr.wcs.blablawild.model.TripResultModel;

import static fr.wcs.blablawild.R.layout;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_itinerary_list);

        Bundle data = getIntent().getExtras();
        SearchModel myTrip = data.getParcelable(ItinerarySearchActivity.SEARCH_DONE);

        String activityTitle = myTrip.getDeparture() + " >> "
                + myTrip.getDestination();

        setTitle(activityTitle);
        Toast.makeText( this, myTrip.getDate(), Toast.LENGTH_SHORT ).show();

        //peupler la liste
        ArrayList<TripResultModel> tripList = new ArrayList<>();
        RecyclerView tripRecylerView = findViewById(R.id.itResultList);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        tripRecylerView.setHasFixedSize( true );

        TripResultAdapter trAdapter = new TripResultAdapter(tripList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        tripRecylerView.setLayoutManager(mLayoutManager);
        tripRecylerView.setItemAnimator(new DefaultItemAnimator());
        tripRecylerView.setAdapter(trAdapter);

        SimpleDateFormat sdf = new SimpleDateFormat(TripResultAdapter.DD_MM_YYYY_MM_HH);

        try {
            tripList.add(new TripResultModel("Eric", "Cartman", sdf.parse("21/02/2017-15:30"), 15));
            tripList.add(new TripResultModel("Stan", "Marsh", sdf.parse("21/02/2017-16:00"), 20));
            tripList.add(new TripResultModel("Kenny", "Broflovski", sdf.parse("21/02/2017-16:30"), 16));
            tripList.add(new TripResultModel("Kyle", "McCormick", sdf.parse("21/02/2017-17:00"), 40));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            tripList.add(new TripResultModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        trAdapter.notifyDataSetChanged();
    }
}
