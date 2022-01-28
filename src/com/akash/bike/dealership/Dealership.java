package com.akash.bike.dealership;

public  class Dealership {

    public static void main(String[] args) {
        Vehicle s1000 = new Vehicle();
        s1000.setNameOfBike("S1000R");
        s1000.setBrand("BMW");
        s1000.setDisplacement(1000);
        s1000.setModelYear(2019);
        s1000.setMileage(15);
        s1000.setPrice(1800000);

        Vehicle trk502X = new Vehicle();
        trk502X.setNameOfBike("TRK-502X");
        trk502X.setBrand("Benelli");
        trk502X.setDisplacement(502);
        trk502X.setModelYear(2021);
        trk502X.setMileage(18);
        trk502X.setPrice(500000);

        Vehicle cbr650r = new Vehicle();
        cbr650r.setNameOfBike("cbr650r");
        cbr650r.setBrand("Honda");
        cbr650r.setDisplacement(644);
        cbr650r.setModelYear(2021);
        cbr650r.setPrice(894000);
        cbr650r.setMileage(20);




        Customer cust1 = new Customer();
        cust1.setName("akash");
        cust1.setAddress("123 Baker Street");
        cust1.setEmployee("Ranvir");
        cust1.setCashOnHand(1200);
        cust1.purchaseBike(cbr650r,"Manoj",true);

        Customer cust2 = new Customer();
        cust2.setName("prakash");
        cust2.setAddress("145 Dalal Street");
        cust2.setEmployee("sharukh");
        cust2.setCashOnHand(809000);




    }
    //this is the bikesDealership Project by Akash Shelke
}
