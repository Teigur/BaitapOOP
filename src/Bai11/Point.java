package Bai11;

public class Point{
    private int p1,p2,p3,p4,p5;

    public Point() {}

    public Point(int p1, int p2, int p3, int p4, int p5) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public int getP5() {
        return p5;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }

    public double average(){
        double i= getP1()+getP2()+getP3()+getP4()+getP5();
        return i/5;
    }

    public boolean check(){
        return getP1() >= 5 && getP2() >= 5 && getP3() >= 5 && getP4() >= 5 && getP5() >= 5;
    }
}