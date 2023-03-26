package org.example.services;

import org.example.entities.Vehicle;
import org.example.entities.enums.TruckSize;

public class FreightCalculator {

    public static double calculateStretch(String distance, Vehicle vehicle) {
        if (vehicle.getSize() == TruckSize.SMALL) {
            double cost = Double.parseDouble(distance) * 4.87;
            return cost;
        }

        else if (vehicle.getSize() == TruckSize.MID) {
            double cost = Double.parseDouble(distance) * 11.92;
            return cost;

        }

        else if (vehicle.getSize() == TruckSize.LARGE) {
            double cost = Double.parseDouble(distance) * 27.44;
            return cost;
        }

        return 0;
    }
}
