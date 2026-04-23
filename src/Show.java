import java.util.ArrayList;

public class Show
{
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printListOfActotrs(){
        for (Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor actor){
        if (listOfActors.contains(actor)){
            System.out.println("Такой актер уже играет в данном спектакле");
        }
        else{
            System.out.println("Актер добавлен в спектакль");
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor actor, String surname){
        boolean find = false;
        for (Actor actor1: listOfActors){
            if (actor1.getSurname().equals(surname)){
                listOfActors.remove(actor1);
                listOfActors.add(actor);
                System.out.println("Новый актер" + actor.toString() + "добавлен" + "актер" + surname + "удален.");
                find = true;
                break;
            }

        }
        if (!find){
            System.out.println("Актера с фамилией" + actor + "найти не удалось");
        }
    }

}
