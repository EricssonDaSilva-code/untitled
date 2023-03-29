package org.example.model;

import org.example.entities.Vehicle;
import org.example.services.FreightService;

import java.util.ArrayList;
import java.util.List;

public class Freight {
    private String contractCompany;
    private City origin;
    private City destiny;
    private List<Charge> chargeList = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();

    public Freight() {

    }

    public Freight(String contractCompany, City origen, City destiny, List<Charge> charge, List<Vehicle> vehicles) {
        this.contractCompany = contractCompany;
        this.origin = origen;
        this.destiny = destiny;
        this.chargeList = charge;
        this.vehicles = vehicles;
    }

    public String getContractCompany() {
        return contractCompany;
    }

    public void setContractCompany(String contractCompany) {
        this.contractCompany = contractCompany;
    }

    public City getOrigen() {
        return origin;
    }

    public City getDestiny() {
        return destiny;
    }

    public void setDestiny(City destiny) {
        this.destiny = destiny;
    }

    public List<Charge> getCharge() {
        return chargeList;
    }

    public void setCharge(List<Charge> charge) {
        this.chargeList = charge;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addCityOrigin(City origin) {
        this.origin = origin;
    }

    public void addCityDestiny(City destiny) {
        this.destiny = destiny;
    }
    public void addCharge(Charge charge) {
        chargeList.add(charge);
    }

    @Override
    public String toString() {
        return "Freight{" +
                "contractCompany='" + contractCompany + '\'' +
                ", origin=" + origin +
                ", destiny=" + destiny +
                ", chargeList=" + chargeList +
                ", vehicles=" + vehicles +
                '}';
    }

    public List<Vehicle> addVehicle() {
        FreightService freightService = null;
        Double distance = freightService.calculateDistance(origin, destiny);
        Double totalWeight = 0.0;
        for (Charge c: chargeList) {
            totalWeight += c.totalWeight;
        }

        return vehicles = freightService.chooseVehicles(totalWeight, distance);
    }
}
