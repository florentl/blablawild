package fr.wcs.blablawild.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import fr.wcs.blablawild.R;
import fr.wcs.blablawild.model.TripResultModel;
import fr.wcs.blablawild.viewholder.TripViewHolder;

public class TripResultAdapter extends RecyclerView.Adapter<TripViewHolder>{

    public static final String DD_MM_YYYY_MM_HH = "dd/MM/yyyy-HH:mm";

    private List<TripResultModel> tripList;

    public TripResultAdapter(ArrayList<TripResultModel> trips) {
        tripList=trips;
    }

    @NonNull
    @Override
    public TripViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        // create a new view
        return new TripViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trip, parent,
                        false));

    }

    @Override
    public void onBindViewHolder(@NonNull TripViewHolder tripViewHolder, int i) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( DD_MM_YYYY_MM_HH );
        TripResultModel myTrip = tripList.get( i );
        tripViewHolder.getmFirstName().setText( myTrip.getFirstName() );
        tripViewHolder.getmLastName().setText( myTrip.getLastname() );
        tripViewHolder.getmDate().setText( dateFormat.format(myTrip.getDate()) );
        tripViewHolder.getmPrice().setText(  "$" + String.valueOf( myTrip.getPrice()) );

    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }

}
