package org.example.model;

import java.util.List;

public class Charge {
    public List<Product> productList;
    public Double totalWeight;

    public Integer quantity;

    public Charge() {

    }

    public Charge(List<Product> productList, Double totalWeight, Integer quantity) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void addProduct(Product product, Integer quantity) {
        productList.add(product);
        totalWeight += product.getWeight() * quantity;
    }

    public void removeProduct(Product product, Integer quantity) {
        productList.remove(product);
        totalWeight -= product.getWeight() * quantity;
    }
}
