package model;
import java.time.LocalDate;

public class Action {

    private  LocalDate date = LocalDate.now();
    private double amount;
    private String type;

    public LocalDate getLocalDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
