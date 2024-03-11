public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;

    public Ogrenci(String ad, String bolum, int girisYili, String bolumKodu, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
    }

    public Ogrenci(int girisYili, String bolumKodu) {
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
    }
    public Ogrenci(){

    }

    public String ogrenciNoOlustur(){
        return Integer.toString(girisYili)+bolumKodu+"001";
    }
    public double harcHesapla(int uzayanYil){//krediyi katmadan sadece uzayan yıla göre hesapladım
        if (2024-girisYili>4)
            return 1000;
        return 0;
    }
    public double harcHesapla(int uzayanYil,double kredi){ //kredi başı 40tl ve dönemlik 1000tlden hesapladım
        if (2024-girisYili>4)
            return 1000+kredi*40;
        return 0;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        if (gano<0.0 || gano >4.0)
            throw new IllegalArgumentException("Gano Değeri 0 ve 4 Aralığında Olmalıdır!");
        else
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

}
