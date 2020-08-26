package RddTransformation;

import java.io.Serializable;

public class CubModel implements Serializable {

 private  String yil;
 private  String evSahibi;
 private  String birinci;
 private  String ikinci;
 private  String ucuncu;
 private  String dorduncu;
 private  int toplamGol;
 private  String toplamUlke;
 private  String toplamMac;
 private  String toplamKatilimciSayisi;

    public CubModel(String yil, String evSahibi, String birinci, String ikinci, String ucuncu, String dorduncu, int toplamGol, String toplamUlke, String toplamMac, String toplamKatilimciSayisi) {
        this.yil = yil;
        this.evSahibi = evSahibi;
        this.birinci = birinci;
        this.ikinci = ikinci;
        this.ucuncu = ucuncu;
        this.dorduncu = dorduncu;
        this.toplamGol = toplamGol;
        this.toplamUlke = toplamUlke;
        this.toplamMac = toplamMac;
        this.toplamKatilimciSayisi = toplamKatilimciSayisi;
    }

    public String getToplamMac() {
        return toplamMac;
    }

    protected void setToplamMac(String toplamMac) {

        this.toplamMac = toplamMac;
    }

    public String getYil() {

        return yil;
    }

    public void setYil(String yil) {

        this.yil = yil;
    }

    public String getEvSahibi() {

        return evSahibi;
    }

    public void setEvSahibi(String evSahibi) {

        this.evSahibi = evSahibi;
    }

    public String getBirinci() {

        return birinci;
    }

    public void setBirinci(String birinci) {

        this.birinci = birinci;
    }

    public String getIkinci() {

        return ikinci;
    }

    public void setIkinci(String ikinci) {
        this.ikinci = ikinci;
    }

    public String getUcuncu() {

        return ucuncu;
    }

    public void setUcuncu(String ucuncu) {

        this.ucuncu = ucuncu;
    }

    public String getDorduncu() {

        return dorduncu;
    }

    public void setDorduncu(String dorduncu) {

        this.dorduncu = dorduncu;
    }

    public int getToplamGol() {

        return toplamGol;
    }

    public void setToplamGol(int toplamGol) {

        this.toplamGol = toplamGol;
    }

    public String getToplamKatilimciSayisi() {

        return toplamKatilimciSayisi;
    }

    public void setToplamKatilimciSayisi(String toplamKatilimciSayisi) {

        this.toplamKatilimciSayisi = toplamKatilimciSayisi;
    }

    public String getToplamUlke() {

        return toplamUlke;
    }

    public void setToplamUlke(String toplamUlke) {

        this.toplamUlke = toplamUlke;
    }
}
