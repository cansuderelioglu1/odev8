import java.time.LocalDate;
import java.time.Period;

public class ErkekPersonel extends Personel {
    public ErkekPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikKalanYil() {
        LocalDate emeklilikYasi = dogumTarihi.plusYears(65);
        return Period.between(LocalDate.now(), emeklilikYasi).getYears();
    }
}
