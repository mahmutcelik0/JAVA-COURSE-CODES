package LISTANDARRAYLIST.ARRAYLISTCHALLENGE;

public class CONTACT {
    private String name;
    private String phoneNumber;

    public CONTACT(){
        this("DEFAULT NAME","DEFAULT NUMBER");
    }

    public CONTACT(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CONTACT NAME: "+this.name
                +"\nPHONE NUMBER: "+this.phoneNumber;
    }



}
