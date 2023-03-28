package org.example.entities;

public class Vehicle {

    public String name;
    public Double payloadCapacity;

    public Double costPerKm;

    public Vehicle() {

    }

    public Vehicle(String name, Double payloadCapacity, Double costPerKm) {
        this.name = name;
        this.payloadCapacity = payloadCapacity;
        this.costPerKm = costPerKm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(Double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public Double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(Double costPerKm) {
        this.costPerKm = costPerKm;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", payloadCapacity=" + payloadCapacity +
                ", costPerKm=" + costPerKm +
                '}';
    }

    public enum TruckSize {
        PEQUENO("Pequeno", 1000, 4.87),
        MEDIO("Médio", 4000, 11.92),
        GRANDE("Grande", 10000, 27.44);

        private final String name;
        private final double payloadCapacity;
        private final double costPerKm;

        TruckSize(String name, double payloadCapacity, double costPerKm) {
            this.name = name;
            this.payloadCapacity = payloadCapacity;
            this.costPerKm = costPerKm;
        }

        public String getName() {
            return name;
        }

        public double getPayloadCapacity() {
            return payloadCapacity;
        }

        public double getCostPerKm() {
            return costPerKm;
        }
    }
}