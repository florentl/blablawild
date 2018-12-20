package fr.wcs.blablawild.triplist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import fr.wcs.blablawild.R;
import fr.wcs.blablawild.model.TripResultModel;

public class ItineraryRecyclerAdapter extends RecyclerView.Adapter<ItineraryViewHolder>{

    public static final String DD_MM_YYYY_MM_HH = "dd/MM/yyyy-HH:mm";

    private List<TripResultModel> tripList;

    public ItineraryRecyclerAdapter(ArrayList<TripResultModel> trips) {
        tripList=trips;
    }

    @NonNull
    @Override
    public ItineraryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        // create a new view
        return new ItineraryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trip, parent,
                        false));

    }

    @Override
    public void onBindViewHolder(@NonNull ItineraryViewHolder itineraryViewHolder, int i) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( DD_MM_YYYY_MM_HH );
        TripResultModel myTrip = tripList.get( i );
        itineraryViewHolder.getmFirstName().setText( myTrip.getFirstName() );
        itineraryViewHolder.getmLastName().setText( myTrip.getLastname() );
        itineraryViewHolder.getmDate().setText( dateFormat.format(myTrip.getDate()) );
        itineraryViewHolder.getmPrice().setText(  "$" + String.valueOf( myTrip.getPrice()) );

    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }



}
