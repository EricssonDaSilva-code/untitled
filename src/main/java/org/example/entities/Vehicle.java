package org.example.entities;

import org.example.entities.enums.TruckSize;

public abstract class Vehicle {

    private TruckSize size;
    private int payloadCapacity;

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
