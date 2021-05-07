package Transportation;

import java.text.DecimalFormat;

public class Bus extends Transportation {
    private int quantity;
    private double cost;

    public Bus(){}

    public Bus(int quantity, double cost) {
        this.quantity = quantity;
        this.cost = cost;
    }

    public Bus(String id, int no, String name, int quantity, double cost) {
        super(id, no, name);
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public double Total() {
        return getQuantity()*(getCost());
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#,##0 VNĐ");
        return String.format("%5s | %10d | %15s | %5d(ghế) | %15s |",getId(),getNo(),getName(),getQuantity(),df.format(getCost()));
    }
}