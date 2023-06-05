package src.main.java;

public class Customer {
    private String name;
    private Double creditLimit;
    private String email;

    public Customer() {
        this("Customer3","nobody@email.com");
    }

    public Customer(String name, String email) {
       this(name,1000.00,email);
    }

    public Customer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
