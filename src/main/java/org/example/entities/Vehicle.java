package org.example.entities;

import org.example.entities.enums.TruckSize;

public class Vehicle {

    public TruckSize size;
    public int payloadCapacity;

    public Vehicle () {

    }

    public Vehicle(TruckSize size) {
        this.size = size;
    }

    public Vehicle(TruckSize size, int payloadCapacity) {
        this.size = size;
        this.payloadCapacity = payloadCapacity;
    }

    public TruckSize getSize() {
        return size;
    }

    public void setSize(TruckSize size) {
        this.size = size;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "size=" + size +
                ", payloadCapacity=" + payloadCapacity +
                '}';
    }
}
