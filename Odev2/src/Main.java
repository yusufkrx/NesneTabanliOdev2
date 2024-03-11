public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci(2023, "123");
        Ogrenci ogrenci2 = new Ogrenci("Taha", "Bilgisayar Müh", 1985, "104", 0);
        Ogrenci ogrenci3 = new Ogrenci("Yusuf", "Makine Müh", 2019, "104", 3);
        Ogrenci ogrenci4 = new Ogrenci("Ahmet", "Elektrik-Elektronik Müh", 2015, "104", 1.98);

        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1 "+ogrenci1.getAd()+" "+ ogrenci1.getBolum()+" "+ogrenci1.ogrenciNoOlustur()+" "+ogrenci1.getGano());
        System.out.println("OGR-2 "+ogrenci2.getAd()+" "+ ogrenci2.getBolum()+" "+ogrenci2.ogrenciNoOlustur()+" "+ogrenci2.getGano());
        System.out.println("OGR-3 "+ogrenci3.getAd()+" "+ ogrenci3.getBolum()+" "+ogrenci3.ogrenciNoOlustur()+" "+ogrenci3.getGano());
        System.out.println("OGR-4 "+ogrenci4.getAd()+" "+ ogrenci4.getBolum()+" "+ogrenci4.ogrenciNoOlustur()+" "+ogrenci4.getGano());
        System.out.println("3. Öğrencinin ödeyeceği harç: " + ogrenci3.harcHesapla(1));
        System.out.println("4. Öğrencinin ödeyeceği harç: " + ogrenci3.harcHesapla(1,21.5));
    }
}