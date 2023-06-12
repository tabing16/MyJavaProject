package src.main.java;

import java.time.Year;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public int getAge(){
        return Year.now().getValue() - Integer.parseInt(this.birthDate);
    }

    public double collectPay(){
        return 2000.00;
    }

    public void terminate(String endDate){
        System.out.println("Termination date: " + endDate);
    }
}
