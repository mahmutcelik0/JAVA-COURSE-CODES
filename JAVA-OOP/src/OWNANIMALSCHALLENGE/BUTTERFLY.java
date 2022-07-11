package OWNANIMALSCHALLENGE;

public class BUTTERFLY extends ANIMALS{
    private double noseLength;
    private String butterflyType;
    private boolean doesItHibernate;    //KIS UYKUSU



    public BUTTERFLY(String butterflyType, boolean doesItHibernate){
        super("NORMAL","LEAFS",2.7,"MG",1,100,5);
        this.noseLength = 6;
        this.butterflyType = butterflyType;
        this.doesItHibernate = doesItHibernate;
    }

    @Override
    public String toString(){
        return
                super.toString()
                +"\nNOSE LENGTH: "+ noseLength
                +"\nBUTTERFLY TYPE: " + butterflyType
                +"\nDOES IT HIBERNATE: "+ doesItHibernate;
    }


    public double getNoseLength() {
        return noseLength;
    }

    public String getButterflyType() {
        return butterflyType;
    }

    public boolean isDoesItHibernate() {
        return doesItHibernate;
    }
}
