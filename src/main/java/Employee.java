public class Employee extends src.main.java.Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
