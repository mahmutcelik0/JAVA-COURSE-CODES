package OWNANIMALSCHALLENGE;

public class ANT extends ANIMALS{
    private int maxWeightCanCarry;
    private String colonyName;
    private int totalAntCountInColony;
    private String archEnemy;

    public ANT(String colonyName,int totalAntCountInColony){
        super("EGGS","GRAIN",65.0,"MG",45,0,2.54);
        this.maxWeightCanCarry = (int)getWeight()*30;
        this.colonyName = colonyName;
        this.totalAntCountInColony = totalAntCountInColony;
        this.archEnemy = "HUMANS";
    }


    @Override
    public String toString(){
        return
                super.toString()
                +"\nMAX WEIGHT CAN CARRY: "+ maxWeightCanCarry
                +"\nCOLONY NAME: "+ colonyName
                +"\nTOTAL ANT COUNT IN COLONY: "+ totalAntCountInColony
                +"\nARCHENEMY: "+archEnemy;
    }


    public int getMaxWeightCanCarry() {
        return maxWeightCanCarry;
    }

    public String getColonyName() {
        return colonyName;
    }

    public int getTotalAntCountInColony() {
        return totalAntCountInColony;
    }

    public String getArchEnemy() {
        return archEnemy;
    }
}
