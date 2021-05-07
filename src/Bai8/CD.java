package Bai8;

public class CD {
    private int Ma;
    private String Tua;
    private int SoBai;
    private double Gia;
    protected CD Next;

    public CD() {
        this.Ma = 999999;
        this.Tua = "chua xac dinh";
    }

    public CD(int ma, String tua, int soBai, double gia) {
        Ma = ma;
        Tua = tua;
        SoBai = soBai;
        Gia = gia;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int ma) {
        if (ma > 0) Ma = ma;
    }

    public String getTua() {
        return Tua;
    }

    public void setTua(String tua) {
        if (tua.equals(""));
        else Tua = tua;
    }

    public int getSoBai() {
        return SoBai;
    }

    public void setSoBai(int soBai) {
        if (soBai > 0) SoBai = soBai;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        if (gia > 0) Gia = gia;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10d %12d %9.2f",Tua,Ma,SoBai,Gia);
    }
}