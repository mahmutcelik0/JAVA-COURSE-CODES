package CLASSES;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(String name, int creditLimit , String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public VipCustomer(){
        this("DEFAULT NAME", 0,"DEFAULT MAIL");
    }
    public VipCustomer(String name, int creditLimit){
        this(name,creditLimit,"DEFAULT MAIL");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
