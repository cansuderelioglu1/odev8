import java.time.LocalDate;
import java.time.Period;

public class KadinPersonel extends Personel {
    public KadinPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikKalanYil() {
        LocalDate emeklilikYasi = dogumTarihi.plusYears(60);
        return Period.between(LocalDate.now(), emeklilikYasi).getYears();
    }
}
