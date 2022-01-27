package udemy.dealership;

public class Customer {
    String Name;
    String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getCashOnHand() {
        return CashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        CashOnHand = cashOnHand;
    }

    double CashOnHand;

    public  void purchaseCar(Vehicle vehicle,Vehicle emp , boolean Finance){


    }
}
