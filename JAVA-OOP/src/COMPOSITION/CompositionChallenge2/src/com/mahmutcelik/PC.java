package com.mahmutcelik;

public class PC {
    GRAPHICSCARD graphicscard ;
    RAM ram ;
    PROCESSOR processor;

    MAINBOARD mainboard ;

    SSD ssd;

    POWERSUPPLY powersupply ;


    public PC(){
         graphicscard = new GRAPHICSCARD("GTX-1650",1.5,5.6,"PROCESS OF IMAGE",4100,3);
         ram = new RAM("Corsair Vengeance SODIMM",3.3,2,"TEMPORARY MEMORY",2330,16,"GB","DDR",4);
         processor = new PROCESSOR("Intel Comet Lake Core i5-10300H 4C/8T",12.5,8.5,"MAKE CALCULATIONS",4175,4.5,"GHz",24.5);
         mainboard = new MAINBOARD("Gigabyte H410M H V3",2.9,5.5,"COMBINE COMPONENTS",1150,4,2,ram,processor);
         ssd = new SSD("WD BLUE SN550 M.2 SSD PCIe",2.5,3,"STOREGE",630,250,"GB",950,2450,"GB");
         powersupply = new POWERSUPPLY("Corsair CV550",35,40,"PROVIDE ENERGY TO EXECUTE COMPUTER",1100,550);
         informationOfPC();
         System.out.println("\n\n");
         compatibilityOfComponents();
    }

    public void informationOfPC(){
        System.out.println(
                graphicscard.toString()+"\n"
                +mainboard.toString()+"\n"
                +powersupply.toString()+"\n"
                +processor.toString()+"\n"
                +ram.toString()+"\n"
                +ssd.toString()
        );
    }

    public void compatibilityOfComponents(){
        mainboard.compatibility();
    }
}
