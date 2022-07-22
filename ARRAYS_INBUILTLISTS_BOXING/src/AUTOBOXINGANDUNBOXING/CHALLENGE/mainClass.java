package AUTOBOXINGANDUNBOXING.CHALLENGE;

import java.util.ArrayList;
import java.util.List;

public class mainClass {
    public static void main(String[] args){
        BANK bank = new BANK("National Australia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Tim",50.05);
        bank.addCustomer("Adelaide","Mike",175.34);
        bank.addCustomer("Adelaide","Percy",220.12);

        bank.addCustomerTransaction("Adelaide","Tim",44.22);
        bank.addCustomerTransaction("Adelaide","Tim",12.44);
        bank.addCustomerTransaction("Adelaide","Mike",1.65);

        System.out.println(bank.listCustomers("Adelaide",true));;
    }
}
