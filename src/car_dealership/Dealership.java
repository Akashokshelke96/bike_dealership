package car_dealership;

public  class Dealership {

    public static void main(String[] args) {
        Vehicle S1000 = new Vehicle();
        S1000.setNameOfBike("S1000R");
        S1000.setBrand("BMW");
        S1000.setDisplacement(1000);
        S1000.setModelYear(2019);
        S1000.setMileage(15);
        S1000.setPrice(1800000);

        Vehicle TRK502X = new Vehicle();
        TRK502X.setNameOfBike("TRK-502X");
        TRK502X.setBrand("Benelli");
        TRK502X.setDisplacement(502);
        TRK502X.setModelYear(2021);
        TRK502X.setMileage(18);
        TRK502X.setPrice(500000);

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
        cust1.purchaseCar(cbr650r,"Manoj",true);

        Customer cust2 = new Customer();
        cust2.setName("prakash");
        cust2.setAddress("145 Dalal Street");
        cust2.setEmployee("sharukh");
        cust2.setCashOnHand(809000);




    }
}
