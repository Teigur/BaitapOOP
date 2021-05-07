package Bai3;

public class Bai3 {

    public static void main(String[] args) {
        System.out.println("3a!");
        TG a = new TG(3,4,5);
        System.out.println("Dien tich tam giac: "+a.dientich());
        System.out.println("Chu vi tam giac: "+a.chuvi());
        System.out.println(a);
        System.out.println("3b!");
        TG a1 = new TG(1,2,5);
        TG b = new TG(0,2,4);
        TG c = new TG(3,3,3);
        TG d = new TG(4,5,4);
        TG e = new TG(3,6,8);
        System.out.println(String.format("%-23s %10s %10s","Loai tam giac","chu vi","dien tich"));
        a.xuatloaitg();
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}