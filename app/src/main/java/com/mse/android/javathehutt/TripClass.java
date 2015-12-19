package com.mse.android.javathehutt;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Bill on 12/18/15.
 */
public class TripClass {
    private String vesselName;
    private LatLng destinationPosition;
    private LatLng departurePosition;
    private boolean completed;

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setDestinationPosition(LatLng destinationPosition) {
        this.destinationPosition = destinationPosition;
    }

    public void setDeparturePosition(LatLng departurePosition) {
        this.departurePosition = departurePosition;
    }

    public LatLng getDestinationPosition() {
        return destinationPosition;
    }

    public LatLng getDeparturePosition() {
        return departurePosition;
    }

    public TripClass(String inputVesselName)
    {
        vesselName = inputVesselName;
        destinationPosition = new LatLng(0.0,0.0);
        departurePosition = new LatLng(0.0,0.0);
    }
}
