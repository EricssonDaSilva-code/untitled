package org.example.services;

import org.example.entities.Vehicle;
import org.example.model.City;
import org.example.model.Db;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FreightService {
    private int vehicleList;

    public Double calculateDistance(City origin, City destiny) {
        String[][] data = Db.cityDistance();
        Double distance = Double.valueOf(data[origin.getMatrixCoordenate()][destiny.getMatrixCoordenate()]);
        return distance;
    }

    public List<Vehicle> chooseVehicles(double totalWeight, double distance) {
        List<Vehicle> selectedVehicles = new ArrayList<>();
        double remainingWeight = totalWeight;

        // Ordena os veículos pelo custo por km em ordem crescente
        List<Vehicle> sortedVehicles = new ArrayList<>(this.vehicleList);
        sortedVehicles.sort(Comparator.comparingDouble(Vehicle::getCostPerKm));

        // Percorre a lista ordenada de veículos
        for (Vehicle vehicle : sortedVehicles) {
            double capacity = vehicle.payloadCapacity;

            // Se o veículo tiver capacidade suficiente, adiciona ele à lista de veículos selecionados
            while (remainingWeight > 0 && remainingWeight <= capacity) {
                selectedVehicles.add(vehicle);
                remainingWeight = 0;
            }

            // Se o veículo não tiver capacidade suficiente, adiciona quantos veículos forem necessários
            while (remainingWeight > 0 && remainingWeight > capacity) {
                selectedVehicles.add(vehicle);
                remainingWeight -= capacity;
            }

            // Se não houver mais peso para ser transportado, encerra o loop
            if (remainingWeight == 0) {
                break;
            }
        }

        // Se ainda houver peso restante, retorna null indicando que não foi possível selecionar veículos suficientes
        if (remainingWeight > 0) {
            return null;
        }

        return selectedVehicles;
    }


}

