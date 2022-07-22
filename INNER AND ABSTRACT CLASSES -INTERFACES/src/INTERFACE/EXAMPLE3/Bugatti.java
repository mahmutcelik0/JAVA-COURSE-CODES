package INTERFACE.EXAMPLE3;

public class Bugatti implements Car{
    private int tekerSayisi;
    private int egzosSayisi;
    private int kapiSayisi;
    private int camSayisi;

    private int vitesSayisi;

    public Bugatti(int tekerSayisi, int egzosSayisi, int kapiSayisi, int camSayisi, int vitesSayisi) {
        this.tekerSayisi = tekerSayisi;
        this.egzosSayisi = egzosSayisi;
        this.kapiSayisi = kapiSayisi;
        this.camSayisi = camSayisi;

        this.vitesSayisi = vitesSayisi;
    }

    @Override
    public String toString(){
        return "\n--------------------------------\n"+getClass().getSimpleName()+
                "\nTEKER SAYISI: "+ this.tekerSayisi
                        +"\nEGZOS SAYISI: "+this.egzosSayisi
                        +"\nKAPI SAYISI: "+ this.kapiSayisi
                        +"\nCAM SAYISI: " + this.camSayisi
                        +"\nVITES SAYISI: "+ this.vitesSayisi;
    }

    @Override
    public int getTekerSayisi(){
        return this.tekerSayisi;
    }

    @Override
    public void setTekerSayisi(int tekerSayisi){
        this.tekerSayisi = tekerSayisi;
    }

    @Override
    public int getEgzosSayisi(){
        return this.egzosSayisi;
    }

    @Override
    public void setEgzosSayisi(int egzosSayisi){
        this.egzosSayisi = egzosSayisi;
    }

    @Override
    public int getKapiSayisi(){
        return this.kapiSayisi;
    }

    @Override
    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public int getCamSayisi() {
        return this.camSayisi;
    }

    @Override
    public void setCamSayisi(int camSayisi) {
        this.camSayisi = camSayisi;
    }

    @Override
    public int getVitesSayisi() {
        return this.vitesSayisi;
    }

    @Override
    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }
}

