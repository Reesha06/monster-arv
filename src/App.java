
public class App {

    public static void main(String[] args) {

        Monster monster = new Monster("Vampyr", 100, 20);

        monster.attack();

        System.out.println("Monstrets hälsa: " + monster.getHalsa());

        monster.taSkada(40);

        System.out.println("Monstrets hälsa efter skadan: " + monster.getHalsa());
    }
}

