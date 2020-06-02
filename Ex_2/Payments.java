package Lesson_05.Ex_02;

import java.util.ArrayList;
import java.util.Collections;

public class Payments {
    private Receipts receipt;
    private Currencies currencies;
    private double balance;


    public Payments(Currencies currency, Products... prod) {
        ArrayList<Products> products = new ArrayList<>();
        Collections.addAll(products, prod);
        receipt = new Payments.Receipts(products);
        this.currencies = currency;
        int temp = (int)(receipt.getBalance() * currency.getRate() * 100);
        balance = (double) temp / 100;
        System.out.println(String.format("Check amount: %.2f %s. You want to pay in %ss. ",
                receipt.getBalance(), "dollars", currency.getCurName()));
        System.out.println(String.format("You need to pay %.2f %ss.", balance, currency.getCurName()));
    }


//
    public void makePayment(Currencies currency, double deposit) {
        if(balance < deposit) {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getCurName()));
            double change = deposit - balance;
            System.out.println(String.format("Your change is %.2f %ss.", change, currency.getCurName()));

        } else if(balance == deposit) {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getCurName()));
            System.out.println("Thank you for paying without change.");
        } else {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getCurName()));
            balance -= deposit;
            System.out.println(String.format("Balance of payment: %.2f %ss.", balance, this.currencies.getCurName()));
        }
    }
//
public static class Receipts {

    private ArrayList<Products> products;
    private double balance;


    public Receipts(ArrayList<Products> products) {
        this.products = products;
        balance = getTotalPrice();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Products product: products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public void removeProdact(Products product){
        products.remove(product);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "products=" + products +
                ", balance=" + balance +
                '}';
    }
}
}

