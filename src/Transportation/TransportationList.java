package Transportation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TransportationList extends ArrayList<Transportation> {
    public boolean Add(Transportation t) {
        boolean a = true;
        if (this.isEmpty())
            this.add(t);
        else {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getId().trim().equals(t.getId().trim())) {
                    a = false;
                    System.out.println("Thêm phần tử không thành công!");
                    break;
                }
            }
            if (a) this.add(t);
        }
        return a;
    }

    public boolean remove(Transportation t){
        boolean a=false;
        for(int i=0;i<this.size();i++){
            if(this.get(i).getId().trim().equals(t.getId().trim())){
                a=true;
                this.remove(i);
                break;
            }
        }
        if(!a) System.out.println("Không tìm thấy phần tử - Xóa thất bại!");
        return a;
    }

    public void PrintTotal(){
        DecimalFormat df = new DecimalFormat("#,##0 VNĐ");
        Truck t = new Truck();
        double S1 = 0;
        for(Transportation p:this){
            if(p.getClass()==t.getClass()) S1+=p.Total();
        }
        Bus b = new Bus();
        double S2 = 0;
        for(Transportation p:this){
            if(p.getClass() == b.getClass()) S2 = p.Total();
        }
        System.out.println("DOANH THU XE TẢI: "+df.format(S1));
        System.out.println("DOANH THU XE KHÁCH: "+df.format(S2));
    }

    public void SortById(){
        Collections.sort(this, new Comparator<Transportation>() {
            @Override
            public int compare(Transportation o1, Transportation o2) {
                return o1.getId().trim().compareTo(o2.getId().trim());
            }
        });
    }

    public void Print(){
        System.out.println("DANH SÁCH XE TẢI: ");
        Truck t = new Truck();
        for(Transportation p:this){
            if(p.getClass() == t.getClass()) System.out.println(p);
        }
        System.out.println("DANH SÁCH XE KHÁCH: ");
        Bus b = new Bus();
        for(Transportation p:this){
            if(p.getClass() == b.getClass()) System.out.println(p);
        }
    }
}