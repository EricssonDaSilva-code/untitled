package org.example.model;

public class Product {

    public String name;
    public Double weight;
    public Product() {

    }

    public Product(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Product addProduct(String name, Double weight) {
        this.name = name;
        this.weight = weight;
        return null;
    }

}
