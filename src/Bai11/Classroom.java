package Bai11;

import java.util.ArrayList;
import java.util.List;

public class Classroom{
    private List<Student> st=new ArrayList<Student>();
    private int countLV = 0;
    private int countTN = 0;
    private int countTL = 0;

    public int getCountLV() {
        return countLV;
    }

    public int getCountTN() {
        return countTN;
    }

    public int getCountTL() {
        return countTL;
    }

    public Classroom(List<Student> st) {
        this.st = st;
    }

    public List<Student> getSt() {
        return st;
    }

    public void setSt(List<Student> st) {
        this.st = st;
    }

    @Override
    public String toString() {
        for(int i=0;i<st.size();i++) {
            if (st.get(i).getP().check() && st.get(i).p.average() > 7) countLV++;
            else if (st.get(i).getP().check()) countTN++;
            else countTL++;
        }
        return String.format("Số học viên làm luận văn: %d\nSố học viên thi tốt nghiệp: %d\nSố học viên thi lại: %d\n",countLV,countTN,countTL);
    }
}