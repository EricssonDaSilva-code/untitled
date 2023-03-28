package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Charge {
    public List<Product> productList = new ArrayList<>();
    public Double totalWeight;

    public Double quantity;

    public Charge() {

    }

    public Charge(List<Product> productList, Double totalWeight, Double quantity) {
        this.productList = productList;
        this.totalWeight = totalWeight;
        this.quantity = quantity;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void addProduct(Product product, Double quantity) {
        productList.add(product);
        if (totalWeight == null) {
            totalWeight = product.getWeight() * quantity;
        }
        else {

            totalWeight += product.getWeight() * quantity;
        }
    }

    public void removeProduct(Product product, Double quantity) {

        productList.remove(product);
        totalWeight -= product.getWeight() * quantity;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "productList=" + productList +
                ", totalWeight=" + totalWeight +
                ", quantity=" + quantity +
                '}';
    }
}
