import java.time.LocalDate;
import java.time.Period;

public abstract class Personel {
    protected String ad;
    protected String soyad;
    protected LocalDate dogumTarihi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public abstract int emeklilikKalanYil();

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
