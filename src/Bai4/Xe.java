package Bai4;

import java.util.Scanner;

public class Xe {
    private String chuxe,loaixe;
    private int dungtich;
    private int trigia;

    Scanner sc = new Scanner(System.in);

    public Xe() {
    }

    public Xe(String chuxe, String loaixe, int dungtich, int trigia) {
        this.chuxe = chuxe;
        this.loaixe = loaixe;
        if (trigia < 0){
            System.out.println("Gia tri cua chu xe " + chuxe+ " khong phu hop, vui long nhap lai: ");
            trigia = sc.nextInt();
        }
        else this.trigia = trigia;
        if (dungtich < 0){
            System.out.println("Xylanh cua xe " + loaixe + " khong phu hop, vui long nhap lai: ");
            dungtich = sc.nextByte();
        }
        else this.dungtich = dungtich;
    }

    public double Thue(){
        if (dungtich < 100) return (0.01*trigia);
        else if (dungtich >= 100 && dungtich < 200) return (0.02*trigia);
        else return (0.05*trigia);
    }

    public String getChuxe() {
        return chuxe;
    }

    public void setChuxe(String chuxe) {
        this.chuxe = chuxe;
        if (chuxe.equals("")) {
            System.out.println("Ten chu xe khong phu hop, vui long nhap lai: ");
            this.setChuxe(sc.nextLine());
        }
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        if (chuxe==null) {
            System.out.println("Vui long nhap ten chu xe");
            this.setChuxe(sc.nextLine());
        }
        System.out.println("Nhan loai xe cua chu xe " + chuxe);
        this.loaixe = loaixe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        if (loaixe==null) {
            System.out.println("Vui long nhap ten loai xe");
            this.setLoaixe(sc.nextLine());
        }
        System.out.println("Nhan dung tich cua loai xe " + loaixe);
        this.dungtich = dungtich;
    }

    public int getTrigia() {
        return trigia;
    }

    public void setTrigia(int trigia) {
        if (loaixe==null) {
            System.out.println("Vui long nhap ten loai xe");
            this.setLoaixe(sc.nextLine());
        }
        System.out.println("Nhan gia tri cua loai xe " + loaixe);
        this.trigia = trigia;
    }

    @Override
    public String toString() {
        return String.format("%-25s %-15s %15d %20d %25.2f",chuxe,loaixe,dungtich,trigia,this.Thue());
    }
}