package org.example.model;

import org.example.entities.Vehicle;

import java.util.List;

public class Freight {
    private String contractCompany;
    private City origin;
    private City destiny;
    private List<Charge> chargeList;
    private List<Vehicle> vehicles;

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
}
