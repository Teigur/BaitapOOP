package Bai5;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ThucPham a = new ThucPham("001","Gao",100000,"10/07/2018","10/07/2018");
        ThucPham b = new ThucPham("002","Mi",5000,"01/03/2018","01/09/2018");
        ThucPham c = new ThucPham("003","Nuoc",10000,"01/03/2017","01/03/2018");
        System.out.println(String.format("%-8s %-10s %13s %15s %15s %10s","Ma_Hang","Ten_Hang","Don_Gia","Ngay_San_Xuat","Ngay_Het_Han","Ghi_Chu"));
        for (int i = 0; i < 83; i++) System.out.print("-");
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}