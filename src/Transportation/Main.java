package Transportation;

public class Main {
    public static void main(String[] args) {
        Truck t1 = new Truck("ABC",123,"Nam",200000,5,"8 tấn");
        Truck t2 = new Truck("CDE",124,"Nhat",200000,10,"16 tấn");
        Truck t3 = new Truck("EFG",156,"Quang",250000,8,"8 tấn");
        Bus b1 = new Bus("XYZ",128,"Hoang",30,7000);
        Bus b2 = new Bus("ZWT",128,"Tam",25,6000);
        Bus b3 = new Bus("TUV",190,"Thanh",35,3000);

        TransportationList p=new TransportationList();
        p.Add(t1);
        p.Add(t2);
        p.Add(t3);
        p.Add(b1);
        p.add(b2);
        p.Add(b3);

        p.PrintTotal();
        p.Print();
        p.SortById();
        p.Print();
        p.remove(t1);
        p.Print();
    }
}
