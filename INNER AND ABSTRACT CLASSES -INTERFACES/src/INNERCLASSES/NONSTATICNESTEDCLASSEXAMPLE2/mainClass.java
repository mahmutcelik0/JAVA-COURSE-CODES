package INNERCLASSES.NONSTATICNESTEDCLASSEXAMPLE2;

public class mainClass {
    public static void main(String[] args) {

        //NORMAL NESNE OLUSTURMA
        KagitKek kagitKek = new KagitKek(100,10,"MEYVELI",150);

        //INNER CLASSTAN NESNE OLUSTURMA
        KagitKek.Harc harc = kagitKek.new Harc("MEYVE",130);
    }
}
