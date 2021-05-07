package Bai9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    protected int orderID;
    protected LocalDate orderDate;
    private List<OrderDetail> lineItems=new ArrayList<OrderDetail>();
    private int count;
    private String date;
    private int n;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order(int orderID, LocalDate orderDate) {
        n = 0;
        this.orderID = orderID;
        this.orderDate = orderDate;
        date = formatter.format(orderDate);
    }

    public String getOrderDate() {
        return date;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
        date = formatter.format(orderDate);
    }

    public int getOrderID() {
        return orderID;
    }

    public void addLineItem(Product p, int q){
        lineItems.add(new OrderDetail(p,q));
        n++;
    }

    public double calcTotalCharge(){
        double sum = 0;
        for(int i=0 ; i<lineItems.size(); i++){
            sum+=lineItems.get(i).calcTotalPrice();
        }
        return sum;
    }
}