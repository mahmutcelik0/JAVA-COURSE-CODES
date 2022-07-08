package CLASSES;

public class BankAccountChallenge {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccountChallenge(){
        this(0,0,"DEFAULT NAME","DEFAULT MAIL",0);
    }
    public BankAccountChallenge(int accountNumber, String customerName){
        this(accountNumber,0,customerName,"DEFAULT MAIL",0);
    }
    public BankAccountChallenge(int accountNumber, int balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(int amount){
        setBalance(getBalance()+amount);
        System.out.println("DEPOSIT OF :"+amount+" YOUR NEW BALANCE IS: "+ getBalance());
    }

    public void withdrarMoney(int amount){
        if(amount > getBalance()){
            System.out.println("THERE IS NOT ENOGH MONEY.YOU CAN'T WITHDRAW");
        }
        else{
            setBalance(getBalance()-amount);
            System.out.println("WITHDRAWAL OF :"+amount +" YOUR NEW BALANCE IS: "+ getBalance());
        }
    }

    @Override
    public String toString(){
        return "CUSTOMER NAME:"+customerName +
                "\nEMAIL:"+ email+
                "\nPHONE NUMBER:"+phoneNumber+
                "\nACCOUNT NUMBER:"+Integer.toString(accountNumber)+
                "\nBALANCE:"+Integer.toString(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
