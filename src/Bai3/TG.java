package Bai3;

public class TG {
    private int ma,mb,mc;

    public TG() {
    }

    public TG(int ma, int mb, int mc) {
        if (ma<0||mb<0||mc<0||(ma+mb<mc)||(ma+mc<mb)||(mb+mc<ma)){
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
        else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma>0) this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        if (mb>0) this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc>0) this.mc = mc;
    }
    public int chuvi(){
        return (ma+mb+mc);
    }
    public double dientich(){
        double p = (chuvi())/2;
        double s = Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
        return s;
    }
    public int kieutg(){
        if ((ma+mb<mc)||(ma+mc<mb)||(mb+mc<ma)||(ma==0&&mb==0&&mc==0)) return 6;
        if ((ma*ma+mb*mb==mc*mc)||(mc*mc+mb*mb==ma*ma)||(mc*mc+ma*ma==mb*mb))
            if (ma==mb||ma==mc) return 4;   //vuong can
            else return 1; //vuong
        if (ma==mb&&ma==mc) return 3;   //deu
        if (ma==mb||ma==mc) return 2;   //can
        if ((ma*ma+mb*mb<mc*mc)||(mc*mc+mb*mb<ma*ma)||(mc*mc+ma*ma<mb*mb)) return 5; //tu
        return 0;   //nhon
    }
    public String xuatloaitg(){
        int k = this.kieutg();
        String t;
        switch (k){
            case 0:{
                t="tam giac nhon";
                break;
            }
            case 1:{
                t="tam giac vuong";
                break;
            }
            case 2:{
                t="tam giac can";
                break;
            }
            case 3:{
                t="tam giac deu";
                break;
            }
            case 4:{
                t="tam giac vuong can";
                break;
            }
            case 5:{
                t="tam giac tu";
                break;
            }
            default:{
                t="khong phai la tam giac";
                break;
            }
        }
        return t;
    }

    @Override
    public String toString() {
        return String.format("%-23s %10.2f %10d",xuatloaitg(),this.dientich(),this.chuvi());
    }
}