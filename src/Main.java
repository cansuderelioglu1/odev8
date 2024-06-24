import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personel lider = new ErkekPersonel("Ahmet", "Yahsi", LocalDate.of(1980, 1, 1));
        Departman departman = new Departman("Yazılım", lider);

        Personel personel1 = new KadinPersonel("Ayşe", "Yılmaz", LocalDate.of(1990, 5, 15));
        Personel personel2 = new ErkekPersonel("Mehmet", "Kara", LocalDate.of(1985, 7, 20));

        departman.personelEkle(personel1);
        departman.personelEkle(personel2);

        Gorev gorev1 = new Gorev("Projeyi tamamla");
        departman.gorevEkle(gorev1);

        // Görev tamamlama
        departman.goreviTamamlandiOlarakIsaretle(gorev1);

        // Emeklilik hesaplama
        System.out.println("Ayşe'nin emekliliğine kalan yıl: " + personel1.emeklilikKalanYil());
        System.out.println("Mehmet'in emekliliğine kalan yıl: " + personel2.emeklilikKalanYil());

        // Departman bilgilerini yazdırma
        System.out.println(departman);
    }
}
