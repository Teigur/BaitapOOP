package Transportation;

import java.text.DecimalFormat;

public class Truck extends Transportation {
    private double cost;
    private double quantity;
    private String type;
    private final double fee=30000;

    public Truck(){}

    public Truck(double cost, double quantity, String type) {
        this.cost = cost;
        this.quantity = quantity;
        this.type = type;
    }

    public Truck(String id, int no, String name, double cost, double quantity, String type) {
        super(id, no, name);
        this.cost = cost;
        this.quantity = quantity;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!this.type.trim().equals("8 tấn") && !this.type.trim().equals("16 tấn"))
            try {
                throw new Exception("Lỗi: Trọng tải xe không hợp lệ!");
            }catch (Exception e){
                e.printStackTrace();
            }
        else this.type=type;
    }

    @Override
    public double Total() {
        if(this.type.trim().equals("8 tấn")) return getCost()*getQuantity();
        else if(this.type.trim().equals("16 tấn")) return getQuantity()*getCost()*fee;
        else try{
                throw new Exception("Lỗi: Không tính được thành tiền!");
            }catch (Exception e){
                e.printStackTrace();
            }
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#,##0 VNĐ");
        return String.format("%5s | %10d | %15s | %15s | %5.2f(tấn) | %10s |",getId(),getNo(),getName(),df.format(getCost()),getQuantity(),getType());
    }
}