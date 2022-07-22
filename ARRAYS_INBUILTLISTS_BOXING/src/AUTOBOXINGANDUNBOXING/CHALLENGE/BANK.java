package AUTOBOXINGANDUNBOXING.CHALLENGE;

import java.util.ArrayList;

public class BANK {
    private String name;
    private ArrayList<Branch> branches ;

    public BANK(String nameOfBank){
        this.name = nameOfBank;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch){
        if(branches.contains(new Branch(nameOfBranch))) return false;
        else {
            branches.add(new Branch(nameOfBranch));
            return true;
        }
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction){
        if(!branches.contains(new Branch(nameOfBranch)))return false;
        if(branches.get(branches.indexOf(new Branch(nameOfBranch))).getCustomerArrayList().contains(new Customer(nameOfCustomer,initialTransaction))) return false;
        else{
            branches.get(branches.indexOf(new Branch(nameOfBranch))).newCustomer(nameOfCustomer,initialTransaction);
            return true;
        }
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction){
        if(!branches.contains(new Branch(nameOfBranch)))return false;

        for(Customer customers: branches.get(branches.indexOf(new Branch(nameOfBranch))).getCustomerArrayList()){
            if(customers.getName().equals(nameOfCustomer)){
                customers.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    public Branch findBranch(String nameOfBranch){
        if(branches.contains(new Branch(nameOfBranch))) return new Branch(nameOfBranch);
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions){
        if(branches.contains(new Branch(nameOfBranch))){
            for(Customer customers: branches.get(branches.indexOf(new Branch(nameOfBranch))).getCustomerArrayList()){
                if(printTransactions){
                    System.out.println(customers.getName());
                }
            }
            return true;
        }
        else return false;
    }
}
