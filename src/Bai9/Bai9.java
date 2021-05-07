package Bai9;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bai9 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0 VNĐ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Product p1 = new Product("Nước tương", "sp4", 8000);
        Product p2 = new Product("Gạo", "sp1", 18000);
        Product p3 = new Product("Đường", "sp3", 10000);
        Product p4 = new Product("Gạo", "sp1", 18000);
        Order o = new Order(1, LocalDate.now());
        o.addLineItem(p1, 10);
        o.addLineItem(p2, 5);
        o.addLineItem(p3, 1);
        o.addLineItem(p4, 1);
        System.out.println("Mã HĐ: " + o.orderID);
        System.out.println("Ngày lập hóa đơn: " + dateTimeFormatter.format(o.orderDate));
        System.out.println(String.format("%-5s | %-7s | %-10s | %15s | %10s | %15s", "STT", "Mã SP", "Mô tả", "Đơn giá", "S Lượng", "Thành tiền"));
        System.out.println(o);
        System.out.println("Tổng tiền thanh toán: " + decimalFormat.format(o.calcTotalCharge()));
    }
}