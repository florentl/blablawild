package fr.wcs.blablawild.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import fr.wcs.blablawild.R;
import fr.wcs.blablawild.model.TripModel;

public class TripAdapter extends ArrayAdapter<TripModel> {

    public TripAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TripModel myTrip = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
        }
        // Lookup view for data population
        TextView firstname = convertView.findViewById(R.id.firstName);
        TextView lastname = convertView.findViewById(R.id.lastName);
        TextView price = convertView.findViewById(R.id.priceInfo);
        TextView date = convertView.findViewById(R.id.dateInfo);

        // Populate the data into the template view using the data object
        firstname.setText(myTrip.getFirstname());
        lastname.setText(myTrip.getLastname());
        price.setText(myTrip.getPrice() + " $");
        //date.setText();

        //tvName.setText(user.name);
        //tvHome.setText(user.hometown);
        // Return the completed view to render on screen
        return convertView;
    }

}
