package INTERFACE.CHALLENGE;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name,int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "SWORD";
    }

    @Override
    public List<String> write(){
        List<String> listToReturn = new ArrayList<>() ;
        listToReturn.add(this.name);
        listToReturn.add(Integer.toString(this.hitPoints));
        listToReturn.add(Integer.toString(this.strength));
        listToReturn.add(weapon);
        return listToReturn;
    }

    public void read(List<String> listFromSomewhere){
        if(listFromSomewhere != null && listFromSomewhere.size() >0){
            this.name = listFromSomewhere.get(0);
            this.hitPoints = Integer.parseInt(listFromSomewhere.get(1));
            this.strength = Integer.parseInt(listFromSomewhere.get(2));
            this.weapon = listFromSomewhere.get(3);
        }

    }

    @Override
    public String toString(){
        return
               "name="+ this.name
               +"\nhitPoints="+ this.hitPoints
                +"\nstrength="+ this.strength
                +"\nweapon=" + this.weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
