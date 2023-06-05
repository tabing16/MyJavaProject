package src.main.java;

import src.main.java.Customer;

import java.util.Scanner;
//add comment
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim",1000.00, "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
    }
}
