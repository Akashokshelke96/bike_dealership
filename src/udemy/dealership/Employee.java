package udemy.dealership;

public class Employee {


    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if (finance == true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);

            }else if (vehicle.getPrice() <= cust.getCashOnHand()){
            System.out.println("You dont have that much money to buy");

        }

        }

    public void runCreditHistory(Customer cust , double loanAmount) {
        System.out.println("Ran Credit history and has now approved for the loan on the vehicle");


    }
    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchases");
    }
}

