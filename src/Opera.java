public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, String librettoText) {
        super(title, duration, director, librettoText);
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

}
