package Bai9;

public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail(Product product, int quatity) {
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double calcTotalPrice(){
        return quatity*product.price;
    }

    public void add(OrderDetail x){
    }

    @Override
    public String toString() {
        return "OrderDetail{}";
    }
}