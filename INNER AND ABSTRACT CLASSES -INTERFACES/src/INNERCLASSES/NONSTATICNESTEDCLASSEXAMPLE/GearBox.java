package INNERCLASSES.NONSTATICNESTEDCLASSEXAMPLE;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    /**THIS CLASS CALLS NONSTATIC NESTED CLASS OR INNER CLASS
     * WE ARE DEFINING CLASS INTO A CLASS SO WE CAN USE THIS CLASS IN LARGER CLASS*/
    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        /**
         * HEM ASIL CLASSTA HEM DE INNER CLASSTA gearNumber field ları bulunuyor
         * Fakat burada this.gearNumber yaptığımızda bulunduğu classın field ına
         * erişilir. Scope mantığı  */

        public double driveSpeed(int revs){
            return revs* (this.ratio);
        }
    }
}
