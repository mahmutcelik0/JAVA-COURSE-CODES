package INTERFACE.CHALLENGE;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitpoints;
    private int strength;

    public Monster(String name,int hitpoints, int strength){
        this.name= name;
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    @Override
    public List<String> write(){
        List<String> listToReturn = new ArrayList<>();
        listToReturn.add(this.name);
        listToReturn.add(Integer.toString(hitpoints));
        listToReturn.add(Integer.toString(strength));
        return listToReturn;
    }

    @Override
    public void read(List<String> listFromMethod){
        if(listFromMethod != null && listFromMethod.size() >0 ){
            this.name = listFromMethod.get(0);
            this.hitpoints = Integer.parseInt(listFromMethod.get(1));
            this.strength = Integer.parseInt(listFromMethod.get(2));
        }
    }

    @Override
    public String toString(){
        return
                "name="+ this.name
                +"\nhitPoints="+this.hitpoints
                +"\nstrength=" +this.strength;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrength() {
        return strength;
    }
}
