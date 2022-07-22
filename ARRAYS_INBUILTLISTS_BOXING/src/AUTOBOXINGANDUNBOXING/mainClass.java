package AUTOBOXINGANDUNBOXING;

import java.util.ArrayList;
import java.util.Objects;

public class mainClass {
    public static void main(String[]args){
        ArrayList<Double> newDoubleList = new ArrayList<>();

        for(double a = 0 ; a < 10.0 ; a+=0.5){
            newDoubleList.add(a);
        }

        for(int b = 0 ; b < newDoubleList.size() ; b++){
            System.out.println(b +"--> "+ newDoubleList.get(b));
        }
    }
}
