package com.akash.bike.dealership;

public class Employee extends Dealership{
    String employeeName;
    String empId;
    Boolean finance;
    String dept;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Boolean getFinance() {
        return finance;
    }

    public void setFinance(Boolean finance) {
        this.finance = finance;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static void handleCustomer(Customer customer,boolean finance, Vehicle vehicle){
        if(finance){

        }
    }
    public static void runCreditHistory(Customer cust , double amount, Vehicle vehicle){
        System.out.println("yes you canm  buy this car");

    }


}
