package Bai11;

public class Student {
    private String name;
    private int year;
    protected Point p;

    public Student(String name, int year, Point p) {
        this.name = name;
        this.year = year;
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
}