package Bai7;

public class HinhTron {
    private ToaDo tam;
    private double bankinh;

    public HinhTron() {
    }

    public HinhTron(float x, float y, double bankinh) {
        this.tam = new ToaDo(x,y);
        this.bankinh = bankinh;
    }

    public HinhTron(String ten, float x, float y, double bankinh) {
        this.tam = new ToaDo(ten,x,y);
        this.bankinh = bankinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setTam(float x, float y) {
        tam.setX(x);
        tam.setY(y);
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double TinhChuVi(){
        return 2*Math.PI*bankinh;
    }

    public double TinhDienTich(){
        return bankinh*bankinh*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Hinh tron tam %4s co dien tich va chu vi lan luot la %4.3f %4.3f",getTam(),TinhDienTich(),TinhChuVi());
    }
}