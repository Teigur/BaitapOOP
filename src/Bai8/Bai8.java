package Bai8;

public class Bai8{
    public static void main(String[] args) {
        ListofCD a = new ListofCD(5);
        a.Add(1,"HI",3,4.4);
        a.Add(2,"HE",4,3.5);
        a.Add(3,"HA",6,5.2);
        a.SortAscending();
        System.out.println(String.format("%-10s %10s %12s %9s","Tua cua CD","Ma CD","So bai hat","Gia CD"));
        System.out.println(a);
    }
}
