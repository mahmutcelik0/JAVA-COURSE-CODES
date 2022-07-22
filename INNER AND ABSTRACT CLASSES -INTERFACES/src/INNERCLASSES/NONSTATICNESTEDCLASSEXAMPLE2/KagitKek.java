package INNERCLASSES.NONSTATICNESTEDCLASSEXAMPLE2;

public class KagitKek {
    private double weight;
    private int taste;

    private Harc harc;

    public KagitKek(double weight, int taste, String malzeme, double malzemeToplamAgirlik) {
        this.weight = weight;
        this.taste = taste;
        this.harc = new Harc(malzeme,malzemeToplamAgirlik);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTaste() {
        return taste;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public Harc getHarc() {
        return harc;
    }

    public void setHarc(Harc harc) {
        this.harc = harc;
    }

    //INNER CLASS OR NON STATIC NESTED CLASS
    public class Harc{
        private String malzeme;
        private double malzemeToplamAgirlik;

        public Harc(String malzeme, double malzemeToplamAgirlik){
            this.malzeme= malzeme;
            this.malzemeToplamAgirlik = malzemeToplamAgirlik;
        }

        public String getMalzeme() {
            return malzeme;
        }

        public void setMalzeme(String malzeme) {
            this.malzeme = malzeme;
        }

        public double getMalzemeToplamAgirlik() {
            return malzemeToplamAgirlik;
        }

        public void setMalzemeToplamAgirlik(double malzemeToplamAgirlik) {
            this.malzemeToplamAgirlik = malzemeToplamAgirlik;
        }
    }
}
