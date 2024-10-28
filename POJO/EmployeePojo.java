package eMart.pojo;
public class EmployeePojo {
    private String empId;
    private String empName;
    private String job;
    private double salary;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" + "empId=" + empId + ", empName=" + empName + ", job=" + job + ", salary=" + salary + '}';
    }
    
}
