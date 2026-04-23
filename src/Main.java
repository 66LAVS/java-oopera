public class Main {

    public static void main(String[] args) {
        Actor actor = new Actor("Николай", "Цескаридзе", Gender.MALE, 190);
        Actor actor1 = new Actor("Человек", "Паук", Gender.MALE, 155);
        Actor actor2 = new Actor("Бэт", "Герл", Gender.FEMALE, 177);

        Director director = new Director("Майкл", "Бэй", Gender.MALE, 3);
        Director director1 = new Director("Джеймс", "Кемерон", Gender.MALE, 1);

        Opera opera = new Opera("Какая - то опера", 45, director, "cи ля до");
        Balet balet = new Balet("лебединое озеро", 55, director1, "Рахманинов", "до ре си");
        MusicalShow musicalShow = new MusicalShow("Дискач", 55, director1, "до ре ми");

        opera.addNewActor(actor);
        opera.addNewActor(actor2);

        balet.addNewActor(actor);

        musicalShow.addNewActor(actor);
        musicalShow.addNewActor(actor1);
        musicalShow.addNewActor(actor2);

        balet.printListOfActotrs();
        opera.printListOfActotrs();
        musicalShow.printListOfActotrs();

        balet.changeActor(actor1, "Цескаридзе");
        balet.printListOfActotrs();

        balet.changeActor(actor2, "Кишлак");

        balet.printLibrettio();
        opera.printLibrettio();

    }
}
