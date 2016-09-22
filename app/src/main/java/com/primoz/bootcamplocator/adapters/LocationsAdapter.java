package com.primoz.bootcamplocator.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.primoz.bootcamplocator.R;
import com.primoz.bootcamplocator.holders.LocationsViewHolder;
import com.primoz.bootcamplocator.models.Coders;

import java.util.ArrayList;

/**
 * Created by primo on 22. 09. 2016.
 */
public class LocationsAdapter extends RecyclerView.Adapter<LocationsViewHolder> {
    private ArrayList<Coders> locations;

    public LocationsAdapter(ArrayList<Coders> locationsWithin10km) {
        this.locations = locationsWithin10km;

    }

    @Override
    public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent, false);
        return new LocationsViewHolder(card);
    }

    @Override
    public void onBindViewHolder(LocationsViewHolder holder, int position) {
        final Coders location = locations.get(position);
        holder.updateUI(location);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Loads
            }
        });

    }

    @Override
    public int getItemCount() {
        return locations.size();
    }
}
