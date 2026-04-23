public class Balet extends MusicalShow {
    private String choreographer;

    public Balet(String title, int duration, Director director, String choreographer, String librettoText) {
        super(title, duration, director, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}
