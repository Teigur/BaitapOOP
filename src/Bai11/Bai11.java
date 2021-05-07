package Bai11;

import java.util.ArrayList;
import java.util.List;

public class Bai11 {
    public static void main(String[] args) {
        List<Student> T2=new ArrayList<Student>();
        T2.add(new Student("Nam",1984,new Point(6,6,6,6,6)));
        T2.add(new Student("Hang",2000,new Point(10,10,10,10,10)));
        Classroom t2=new Classroom(T2);
        System.out.println(t2);
    }
}
