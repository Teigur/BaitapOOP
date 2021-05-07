package Bai2;

import java.util.Scanner;

public class SV {
    private int mssv;
    private String name;
    private double LT,TH;
    Scanner sc = new Scanner(System.in);

    public SV() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public SV(int mssv, String name, double LT, double TH) {
        this.mssv = mssv;
        if (name.equals("")) {
            System.out.println("Bo sung ten cua sinh vien: ");
            name = sc.nextLine();
        }
        else this.name = name;
        if (LT<0 || LT>10) this.LT=0;
        else this.LT = LT;
        if (TH<0 || TH>10) this.TH=0;
        else this.TH = TH;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public double getLT() {
        return LT;
    }

    public void setLT(double LT) {
        this.LT = LT;
    }

    public double getTH() {
        return TH;
    }

    public void setTH(double TH) {
        this.TH = TH;
    }

    public double DTB(){
        return ((LT+TH)/2);
    }

    @Override
    public String toString() {
        return String.format("%-5d %-30s %5.2f %7.2f %7.2f",mssv,name,LT,TH,DTB());
    }
}