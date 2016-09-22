package com.primoz.bootcamplocator.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.primoz.bootcamplocator.R;
import com.primoz.bootcamplocator.models.Coders;

/**
 * Created by primo on 22. 09. 2016.
 */
public class LocationsViewHolder extends RecyclerView.ViewHolder {
    private ImageView locationsImage;
    private TextView locationTitle;
    private TextView locationAddress;

    public LocationsViewHolder(View itemView) {
        super(itemView);

        locationAddress = (TextView) itemView.findViewById(R.id.location_address);
        locationTitle = (TextView) itemView.findViewById(R.id.location_title);
        locationsImage = (ImageView) itemView.findViewById(R.id.location_img);

    }

    public void updateUI(Coders location) {
        String uri = location.getImgUrl();
        int resource = locationsImage.getResources().getIdentifier(uri, null, locationsImage.getContext().getPackageName());
        locationsImage.setImageResource(resource);
        locationTitle.setText(location.getLocationTitle());
        locationAddress.setText(location.getLocationAddress());

    }
}
