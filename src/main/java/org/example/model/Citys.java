package org.example.model;

import java.util.List;

public class Citys {
    public String cityOfOrigin;
    public Integer destinationCity;
    public Integer distance;

    List<Product> productList;

    public Citys() {

    }

    public Citys(String cityOfOrigin, Integer destinationCity, Integer distance, List<Product> productList) {
        this.cityOfOrigin = cityOfOrigin;
        this.destinationCity = destinationCity;
        this.distance = distance;
        this.productList = productList;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Citys{" +
                "cityOfOrigin='" + cityOfOrigin + '\'' +
                ", destinationCity=" + destinationCity +
                ", distance=" + distance +
                ", productList=" + productList +
                '}';
    }
}
