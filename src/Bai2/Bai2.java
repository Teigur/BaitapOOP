package Bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        SV sv1 = new SV(11111,"Nguyen Thanh An",6.5,8.5);
        SV sv2 = new SV(22222,"Le Thi Bong",7.5,8);
        SV sv3 = new SV();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so cua sv: ");
        sv3.setMssv(sc.nextInt());
        String next = sc.nextLine();
        System.out.println("Nhap ho va ten cua sv: ");
        sv3.setName(sc.nextLine());
        System.out.println("Nhap diem ly thuyet cua sv: ");
        sv3.setLT(sc.nextDouble());
        System.out.println("Nhap diem thuc hanh cua sv: ");
        sv3.setTH(sc.nextDouble());
        System.out.println(String.format("%s  %-30s %5s %6s %7s","masv","hoten","diemlt","diemth","diemtb"));
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}