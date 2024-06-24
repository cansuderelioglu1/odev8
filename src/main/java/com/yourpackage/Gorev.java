public class Gorev {
    private String tanim;
    private boolean tamamlandi;

    public Gorev(String tanim) {
        this.tanim = tanim;
        this.tamamlandi = false;
    }

    public void goreviTamamla() {
        this.tamamlandi = true;
    }

    public boolean isTamamlandi() {
        return tamamlandi;
    }

    public String getTanim() {
        return tanim;
    }

    @Override
    public String toString() {
        return "Gorev{" +
                "tanim='" + tanim + '\'' +
                ", tamamlandi=" + tamamlandi +
                '}';
    }
}
