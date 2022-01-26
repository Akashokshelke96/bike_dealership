package car_dealership;

public class Employee extends Dealership{
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

    String employeeName;
    String empId;
    Boolean finance;
    String dept;

}
