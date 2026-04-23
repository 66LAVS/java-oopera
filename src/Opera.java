import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }


    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
    }

}
