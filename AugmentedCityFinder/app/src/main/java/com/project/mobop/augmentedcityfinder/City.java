package com.project.mobop.augmentedcityfinder;

import android.location.Location;

/**
 * Created by Nils on 22.03.2015.
 */
public class City {
    private String cityName, countryName, continentName;
    private Location location;
    private double distance, deltaAzimuth, deltaPitch;
    private int leftMargin, topMargin;
    private boolean isInView = false;

    public City(String cityName, String countryName, String continentName, Location location){
        this.cityName = cityName;
        this.countryName = countryName;
        this.continentName = continentName;
        this.location = location;
    }

    public City(String cityName, String countryName, String continentName, double longitude, double latitude){
        this.cityName = cityName;
        this.countryName = countryName;
        this.continentName = continentName;
        this.location = new Location(cityName);
        setLongitude(longitude);
        setLatitude(latitude);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDeltaAzimuth() {
        return deltaAzimuth;
    }

    public void setDeltaAzimuth(double deltaAzimuth) {
        this.deltaAzimuth = deltaAzimuth;
    }

    public double getDeltaPitch() {
        return deltaPitch;
    }

    public void setDeltaPitch(double deltaPitch) {
        this.deltaPitch = deltaPitch;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public double getLongitude() {
        return location.getLongitude();
    }

    public void setLongitude(double longitude) {
        this.location.setLongitude(longitude);
    }

    public double getLatitude() {
        return location.getLatitude();
    }

    public void setLatitude(double latitude) {
        this.location.setLatitude(latitude);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getLeftMargin() {
        return leftMargin;
    }

    public void setLeftMargin(int leftMargin) {
        this.leftMargin = leftMargin;
    }

    public int getTopMargin() {
        return topMargin;
    }

    public void setTopMargin(int topMargin) {
        this.topMargin = topMargin;
    }

    public boolean isInView() {
        return isInView;
    }

    public void setInView(boolean isInView) {
        this.isInView = isInView;
    }
}
