package Bai4;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Xe a = new Xe();
        Xe b = new Xe("Le Minh Tinh","Ford Ranger",3000,250000000);
        Xe c = new Xe();
        if (a.getTrigia()==0){
            System.out.println("Nhap gia tri cua xe: ");
            int n = sc.nextInt();
            a.setTrigia(n);
        }
        if (a.getDungtich()==0){
            System.out.println("Nhap dung tich cua xe: ");
            int n = sc.nextInt();
            a.setDungtich(n);
        }
        if (b.getTrigia()==0){
            System.out.println("Nhap gia tri cua xe: ");
            int n = sc.nextInt();
            b.setTrigia(n);
        }
        if (b.getDungtich()==0){
            System.out.println("Nhap dung tich cua xe: ");
            int n = sc.nextInt();
            b.setDungtich(n);
        }
        if (c.getTrigia()==0){
            System.out.println("Nhap gia tri cua xe: ");
            int n = sc.nextInt();
            c.setTrigia(n);
        }
        if (c.getDungtich()==0){
            System.out.println("Nhap dung tich cua xe: ");
            int n = sc.nextInt();
            c.setDungtich(n);
        }
        System.out.println(String.format("%-25s %-15s %15s %20s %25s","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop"));
        for (int i = 0; i < 105; i++) System.out.print("=");
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}