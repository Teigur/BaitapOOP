package Bai6;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    private long number;
    private String name;
    private double balance;
    private final double rate = 0.035;
    String du;
    Locale local = new Locale("vi","vn");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

    public Account() {
        balance = 50000;
    }

    public Account(String name, long number, double balance) {
        if (name.equals(" ")) this.name = "chua xac dinh";  else this.name = name;
        if (number > 0) this.number = number; else this.number = 999999;
        if (balance >= 50000) this.balance = balance; else this.balance = 50000;
        du = formatter.format(this.balance);
    }

    public long getNumber() {
        return number;
    }

    public String getDu() {
        return du;
    }

    public boolean deposit(double amount){
        if (amount > 0) {
            balance += amount;
            du = formatter.format(balance);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, double fee){
        if (amount > 0 && (amount + fee <= balance)) {
            balance -= (amount + fee);
            du = formatter.format(balance);
            return true;
        }
        return false;
    }

    public void addInterest(){
        balance += balance * rate;
        du = formatter.format(balance);
    }

    public boolean transfer(Account x, double amount){
        System.out.println("Phi chuyen tien: ");
        double fee = sc.nextDouble();
        if (withdraw(amount,fee) == true && x.deposit(amount) == true) return true;
        return false;
    }

    @Override
    public String toString(){
        return String.format("%-15s %14d %15s",name,number,du);
    }
}