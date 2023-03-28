package org.example.model;

public class City {
    private String name;
    private Integer matrixCoordenate;

    public City() {

    }

    public City(String name, Integer matrixCoordenate) {
        this.name = name;
        this.matrixCoordenate = matrixCoordenate;
    }

    public String getName() {
        return name;
    }

    public Integer getMatrixCoordenate() {
        return matrixCoordenate;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", matrixCoordenate=" + matrixCoordenate +
                '}';
    }

    public City addCity(String name, Integer matrixCoordenate){
        this.name = name;
        this.matrixCoordenate = matrixCoordenate;
        return null;
    }
}
