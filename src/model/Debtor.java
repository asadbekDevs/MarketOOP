package model;

public class Debtor {

    private String name;
    private double amount;
    private History history = new History();

    public void getHistory() {
        history.showActions();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        history.addAction(amount, "+");
    }

    public void returnAmount(double amount) {

        this.amount -= amount;
        history.addAction(amount, "-");

    }

    public void addAmount(double amount) {
        this.amount += amount;
        history.addAction(amount, "+");

    }
}
