package org.example.model;

public class Citys {
    public String cityOfOrigin;
    public Integer destinationCity;
    public Integer distance;

    public Citys(String cityOfOrigin, int numberCityDestiny, String distance) {

    }

    public Citys(String cityOfOrigin, Integer destinationCity, Integer distance) {
        this.cityOfOrigin = cityOfOrigin;
        this.destinationCity = destinationCity;
        this.distance = distance;
    }

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public Integer getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(Integer destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Citys{" +
                "cityOfOrigin='" + cityOfOrigin + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", distance=" + distance +
                '}';
    }
}
