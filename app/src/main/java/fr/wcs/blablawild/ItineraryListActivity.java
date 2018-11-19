package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        Intent intent = getIntent();
        String activityTitle = intent.getStringExtra(ItinerarySearchActivity.FROM) + " >> "
                + intent.getStringExtra(ItinerarySearchActivity.TO);

        setTitle(activityTitle);

    }
}
