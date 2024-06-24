import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private Personel takimLideri;
    private List<Personel> personelListesi;
    private List<Gorev> gorevListesi;

    public Departman(String ad, Personel takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
        this.personelListesi.add(takimLideri);
    }

    public void takimLideriDegistir(Personel yeniLider) {
        if (!personelListesi.contains(yeniLider)) {
            personelListesi.add(yeniLider);
        }
        this.takimLideri = yeniLider;
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public void personelCikar(Personel personel) {
        personelListesi.remove(personel);
    }

    public void gorevEkle(Gorev gorev) {
        gorevListesi.add(gorev);
    }

    public void goreviTamamlandiOlarakIsaretle(Gorev gorev) {
        gorev.goreviTamamla();
    }

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public List<Gorev> getGorevListesi() {
        return gorevListesi;
    }

    @Override
    public String toString() {
        return "Departman{" +
                "ad='" + ad + '\'' +
                ", takimLideri=" + takimLideri +
                ", personelListesi=" + personelListesi +
                ", gorevListesi=" + gorevListesi +
                '}';
    }
}
