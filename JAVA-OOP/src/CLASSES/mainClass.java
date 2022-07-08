package CLASSES;

public class mainClass {
    public static void main(String[] args){
        /*
        Car porsche = new Car();

        System.out.println(porsche.getDoors());
        porsche.setDoors(5);
        System.out.println(porsche.getDoors());
        System.out.println("------------------");
        System.out.println(porsche.getModel());
        porsche.setModel("LAST VERSION");
        System.out.println(porsche.getModel());
        */

        /*
        BankAccountChallenge person1 = new BankAccountChallenge();
        person1.setAccountNumber(1313);
        person1.setCustomerName("MAHMUT CELIK");
        person1.setEmail("mahmut.382@hotmail.com");
        person1.setPhoneNumber(33344);
        person1.setBalance(5500);

        System.out.println(person1.toString());

        person1.depositMoney(1000);
        person1.withdrarMoney(2000);
        person1.withdrarMoney(5000);
        */

        VipCustomer firstCustomer = new VipCustomer();
        System.out.println(firstCustomer.getName() + "\n"+firstCustomer.getEmailAddress()+"\n"
            + firstCustomer.getCreditLimit());
        System.out.println("-------------------------------");
        VipCustomer secondCustomer = new VipCustomer("MAHMUT CELIK",1000);
        System.out.println(secondCustomer.getName() + "\n"+secondCustomer.getEmailAddress()+"\n"
                + secondCustomer.getCreditLimit());
        System.out.println("-------------------------------");
        VipCustomer thirdCustomer = new VipCustomer("Mahmut Celik",2000, "mahmutcelik1618@gmail.com");
        System.out.println(thirdCustomer.getName() + "\n"+thirdCustomer.getEmailAddress()+"\n"
                + thirdCustomer.getCreditLimit());
        System.out.println("-------------------------------");
    }
}

