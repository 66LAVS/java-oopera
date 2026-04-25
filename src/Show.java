import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>(); //вроде все классы починил
    private Scanner scanner = new Scanner(System.in);
    //спасибо за развернутую обратную связь

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
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

    public void printListOfActotrs() {
        System.out.println("Состав данного концерта");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже играет в данном спектакле");
        } else {
            System.out.println("Актер " + actor.getName() + " добавлен в спектакль");
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor actor, String surname) {
        //Мне реализация не понравилась, дайте оценку, что можно было сделать лучше?
        boolean find = false;
        ArrayList<Integer> positions = new ArrayList<>();

        for (int i = 0; i < listOfActors.size(); i++ ) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                System.out.println((i + 1) + " " + listOfActors.get(i).toString());
                positions.add(i);
                find = true;
            }
        }
        if (!find) {
            System.out.println("Актера с фамилией " + surname + " найти не удалось");
            return;
        }
        if (positions.size() == 1){
                listOfActors.remove(listOfActors.getFirst());
                listOfActors.add(actor);
                System.out.println("Новый актер " + actor + " добавлен" + " актер " + surname + " удален.");
        }
        else {
            System.out.println("Выберете какого человека хотите удалить");
            int choise =  scanner.nextInt() - 1;
            Actor deletedActor = listOfActors.get(choise);
            listOfActors.remove(deletedActor);
            listOfActors.add(actor);
            System.out.println("Новый актер " + actor + " добавлен" + " актер " + deletedActor + " удален.");
        }

    }

}
