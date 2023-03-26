package org.example.entities.enums;

public enum TruckSize {

    PEQUENO(1000),
    MEDIO(4000),
    GRANDE  (10000);

    private final int payloadCapacity;

    TruckSize(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}
