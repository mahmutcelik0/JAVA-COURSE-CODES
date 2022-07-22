package INTERFACE.EXAMPLE3;

public interface Car {
    int getTekerSayisi();
    void setTekerSayisi(int tekerSayisi);
    int getEgzosSayisi();
    void setEgzosSayisi(int egzosSayisi);
    int getKapiSayisi();
    void setKapiSayisi(int kapiSayisi);
    int getCamSayisi();
    void setCamSayisi(int camSayisi);
    int getVitesSayisi();
    void setVitesSayisi(int vitesSayisi);

    @Override
    String toString();
}
