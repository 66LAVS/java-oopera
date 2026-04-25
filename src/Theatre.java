public class Theatre {

    public static void main(String[] args) {
        Actor actor = new Actor("Николай", "Цескаридзе", Gender.MALE, 190);
        Actor actor1 = new Actor("Человек", "Паук", Gender.MALE, 155);
        Actor actor2 = new Actor("Бэт", "Герл", Gender.FEMALE, 177);
        Actor actor4 = new Actor("Николай1", "Цескаридзе", Gender.MALE, 190);

        Director director = new Director("Майкл", "Бэй", Gender.MALE, 3);
        Director director1 = new Director("Джеймс", "Кемерон", Gender.MALE, 1);

        Opera opera = new Opera("Какая - то опера", 45, director, "cи ля до");
        Ballet ballet = new Ballet("лебединое озеро", 55, director1, director, "до ре си");
        MusicalShow musicalShow = new MusicalShow("Дискач", 55, director1, "до ре ми");

        opera.addNewActor(actor);
        opera.addNewActor(actor2);

        ballet.addNewActor(actor);
        ballet.addNewActor(actor4);


        musicalShow.addNewActor(actor);
        musicalShow.addNewActor(actor1);
        musicalShow.addNewActor(actor2);

        ballet.printListOfActotrs();
        opera.printListOfActotrs();
        musicalShow.printListOfActotrs();

        ballet.printListOfActotrs();
        ballet.changeActor(actor1, "Цескаридзе");
        ballet.printListOfActotrs();


        ballet.changeActor(actor2, "Кишлак");

        ballet.printLibrettio();
        opera.printLibrettio();

    }
}
