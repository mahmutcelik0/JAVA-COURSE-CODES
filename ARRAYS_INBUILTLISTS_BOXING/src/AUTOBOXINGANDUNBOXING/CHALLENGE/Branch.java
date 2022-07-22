package AUTOBOXINGANDUNBOXING.CHALLENGE;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name){
        this.name = name;
        customerArrayList = new ArrayList<>();
        //instantiate customers ??
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
        Customer mayNewCustomer = new Customer(nameOfCustomer,initialTransaction);
        if(customerArrayList.contains(mayNewCustomer)) return false;
        else{
            customerArrayList.add(mayNewCustomer);
            return true;
        }
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        for(Customer customers : customerArrayList){
            if(customers.getName().equals(nameOfCustomer)) {
                customers.getTransactionsArrayList().add(transaction) ;
                return true;
            }
        }
        return false;
    }

    public Customer findCustomer(String nameOfCustomer){
        for(Customer customers: customerArrayList) {
            if (customers.getName().equals(nameOfCustomer)) {
                return customers;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}
