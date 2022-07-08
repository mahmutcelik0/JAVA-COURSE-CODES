package COMPOSITION.EXAMPLE;

public class PC {
    private Case theCase;
    //COMPOSITION YAPILDI Case CLASSINDAN NESNE OLUSTURULDU VE PC YE EKLENDI
    private Monitor monitor;
    //COMPOSITION YAPILDI Monitor CLASSINDAN NESNE OLUSTURULDU VE PC YE EKLENDI
    private MotherBoard motherBoard;
    //COMPOSITION YAPILDI MotherBoard CLASSINDAN NESNE OLUSTURULDU VE PC YE EKLENDI


    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }



    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //FANCY GRAPHICS
        monitor.drawPixelAt(50,50,"yellow");
    }

}
