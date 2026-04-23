import java.util.ArrayList;

public class MusicalShow extends Show{
    private String musicAuthor;
    private String librettoText;

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
    }

    public void PrintLibrettio(){
        System.out.println("Текст либретто:");
        System.out.println(getLibrettoText());
    }
}
