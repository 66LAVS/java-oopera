import java.util.ArrayList;

public class Balet extends MusicalShow{
    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    private String choreographer;

    public Balet(String title, int duration, Director director, String choreographer, String librettoText) {
        super(title, duration, director, librettoText);
        this.choreographer = choreographer;
    }
}
