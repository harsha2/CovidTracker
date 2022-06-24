package com.covidtracker.covidtracker.models;

public class LocationStats {
    private String State;
    private String Country;
    private int latestTotalCases;
    private int DiffFromPrevDay;

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getDiffFromPrevDay() {
        return DiffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        DiffFromPrevDay = diffFromPrevDay;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", DiffFromPrevDay=" + DiffFromPrevDay +
                '}';
    }
}
