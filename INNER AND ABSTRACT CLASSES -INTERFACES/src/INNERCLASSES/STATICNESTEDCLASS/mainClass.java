package INNERCLASSES.STATICNESTEDCLASS;

public class mainClass {

    static int tableLegCount;
    static double width;
    static double height;

    static class Table{

        public Table(int tableLegCount, double width, double height){
            mainClass.tableLegCount =  tableLegCount;
            mainClass.width = width;
            mainClass.height = height;
        }

        public double calculateArea(){
            return width*height;
        }

        public void printArea(){
            System.out.println("TABLE AREA: "+ calculateArea());
        }

        @Override
        public String toString(){
            return
                    "TABLE LEG COUNT: " +mainClass.tableLegCount
                    +"\nTABLE WIDTH: " + mainClass.width
                    +"\nTABLE HEIGHT: "+ mainClass.height
                    +"\nTABLE AREA: "+ Double.toString(calculateArea());
        }

        public void print(){
            System.out.println(this.toString());
        }
    }

    public static void main(String[] args) {
        Table table = new Table(4,100,100);
        table.print();
    }

}
