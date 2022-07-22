package AUTOBOXINGANDUNBOXING.CHALLENGE;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsArrayList;


    public Customer(String name,double initialTransaction ) {
        this.name = name;
        transactionsArrayList = new ArrayList<>();
        transactionsArrayList.add(initialTransaction);
    }

    public void addTransaction(double transactionForList){
        this.transactionsArrayList.add(transactionForList);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }
}
