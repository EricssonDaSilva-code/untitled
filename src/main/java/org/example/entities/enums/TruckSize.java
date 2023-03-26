package org.example.entities.enums;

public enum TruckSize {

    SMALL(1000),
    MID(4000),
    LARGE(10000);

    private final int payloadCapacity;

    TruckSize(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}
