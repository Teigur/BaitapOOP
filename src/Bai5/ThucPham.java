package Bai5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThucPham {
    private String mahang;
    private String tenhang = "xxx";
    private float dongia;
    private String sx,hh;
    private LocalDate ngaysx = LocalDate.now(), ngayhh = LocalDate.now();
    DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat mn = new DecimalFormat("#,##0.00VND");
    public ThucPham() {
    }

    public ThucPham(String mahang, String tenhang, float dongia, String xuat, String han) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        ngaysx = LocalDate.parse(xuat,ft);
        ngayhh = LocalDate.parse(han,ft);
        sx = ft.format(ngaysx);
        hh = ft.format(ngayhh);
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) throws Exception {
        if (!mahang.trim().equals(""))
            this.mahang = mahang;
        else throw new Exception ("\nLoi: Ma hang rong!");
    }

    public String getsx() {
        return sx;
    }

    public void setNgaysx(String xuat) {
        ngaysx = LocalDate.parse(xuat,ft);
        sx = ft.format(ngaysx);
    }

    public String gethh() {
        return hh;
    }

    public void setNgayhh(String han) {
        ngayhh = LocalDate.parse(han,ft);
        hh = ft.format(ngayhh);
    }

    private boolean henHan(){
        return ngayhh.isBefore((LocalDate.now())) ? true:false;
    }

    private String note(){
        if (henHan()) return "Hang het han";
        return "";
    }

    @Override
    public String toString() {
        return String.format("%-8s %-10s %-15s %-16s %-15s %-10s",mahang,tenhang,mn.format(dongia),sx,hh,note());
    }
}