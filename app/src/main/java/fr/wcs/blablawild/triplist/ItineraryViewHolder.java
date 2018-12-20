package fr.wcs.blablawild.triplist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fr.wcs.blablawild.R;

public class ItineraryViewHolder extends RecyclerView.ViewHolder {

    private TextView mDate;
    private TextView mPrice;
    private TextView mFirstName;
    private TextView mLastName;

    public ItineraryViewHolder(@NonNull View itemView) {
        super( itemView );
        this.mDate = itemView.findViewById( R.id.dateInfo );
        this.mPrice = itemView.findViewById( R.id.priceInfo );
        this.mFirstName = itemView.findViewById( R.id.firstName);
        this.mLastName = itemView.findViewById( R.id.lastName );
    }

    public TextView getmDate() {
        return mDate;
    }

    public void setmDate(TextView mDate) {
        this.mDate = mDate;
    }

    public TextView getmPrice() {
        return mPrice;
    }

    public void setmPrice(TextView mPrice) {
        this.mPrice = mPrice;
    }

    public TextView getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(TextView mFirstName) {
        this.mFirstName = mFirstName;
    }

    public TextView getmLastName() {
        return mLastName;
    }

    public void setmLastName(TextView mLastName) {
        this.mLastName = mLastName;
    }
}
