package com.akash.bike.dealership;

public class Customer {


    public String name;
    public String vehicleToBuy;
    public String employee;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleToBuy() {
        return vehicleToBuy;
    }

    public void setVehicleToBuy(String vehicleToBuy) {
        this.vehicleToBuy = vehicleToBuy;
    }

    public String getEmployee(String sharukh) {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public String address;
    public double cashOnHand;

    public void purchaseBike(Vehicle vehicle, String employee, boolean Finance) {
        if(cashOnHand < vehicle.getPrice() ) System.out.println("You Can gte out of here");
         else System.out.println
                ("now or never");

    }

}
//this is the bikesDealership Project by Akash Shelke
