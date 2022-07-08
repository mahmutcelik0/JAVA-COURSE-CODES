package ENCAPSULATION;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel , boolean duplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <=100) this.tonerLevel = tonerLevel;
        else this.tonerLevel = -1;
        this.duplexPrinter = duplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public void fillUpToner(){
        this.tonerLevel = 100;
        System.out.println("TONER HAS BEEN FILLED SUCCESSFULLY. NEW TONER LEWEL "+ this.tonerLevel);
    }

    public void simPrintingPage(int numberOfPageWillprint){
        if(this.isDuplexPrinter()){
            numberOfPagesPrinted += (2*numberOfPageWillprint);
        }
        else {
            numberOfPagesPrinted += numberOfPageWillprint;
        }
        System.out.println("NUMBER OF PAGES PRINTED: "+ numberOfPagesPrinted);
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }
}
