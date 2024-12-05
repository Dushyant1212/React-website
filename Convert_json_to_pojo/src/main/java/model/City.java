package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {
    @JsonProperty("city")
    private String city;

    @JsonProperty("AQI")
    private int aqi;

    @JsonProperty("population")
    private int population;

    @JsonProperty("area")
    private double area;

    // Getters, Setters, and toString() as before
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return city + " has an AQI of " + aqi + " with a population of " + population +
                " and covers an area of " + area + " sq km.";
    }
}
