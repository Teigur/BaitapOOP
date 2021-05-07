package Bai8;

public class ListofCD {
    private final int n;
    private int dem=0;
    private CD list = null;

    public ListofCD(int n) {
        this.n = n;
    }

    public void Add (int ma, String tua, int soBai, double gia){
        if (list==null){
            list = new CD(ma,tua,soBai,gia);
            dem ++;
        }
        else if (dem != n-1){
            CD temp = list;
            while (temp.Next != null) temp = temp.Next;
            CD moi = new CD(ma,tua,soBai,gia);
            temp.Next = moi;
            dem ++;
        }
    }

    public int getDem() {
        return dem;
    }

    public double TongGia(){
        double sum = 0;
        CD temp = list;
        while (temp != null) {
            temp = temp.Next;
            sum += list.getGia();
        }
        return sum;
    }

    public void SortAscending(){
        for (CD i = list; i.Next != null; i = i.Next){
            for (CD j = i.Next; j != null; j = j.Next){
                if (i.getGia() < j.getGia()){
                    String tua = i.getTua();
                    double a = i.getGia();
                    int b = i.getMa(), c = i.getSoBai();
                    i.setTua(j.getTua());
                    i.setGia(j.getGia());
                    i.setMa(j.getMa());
                    i.setSoBai(j.getSoBai());
                    j.setTua(tua);
                    j.setGia(a);
                    j.setMa(b);
                    j.setSoBai(c);
                }
            }
        }
    }

    public void SortDescending(){

    }

    @Override
    public String toString() {
        CD temp = list;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.Next;
        }
        return "Done";
    }
}