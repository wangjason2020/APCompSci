import java.util.Random;

public class Battleship extends Starship implements IsOffense {

    public Battleship(String newName) {

        name=newName;

        Random rand=new Random();

        hull=3000+rand.nextInt(2001);
        shield=1500+rand.nextInt(501);
        beam=4000+rand.nextInt(1001);
        torpedoe=40+rand.nextInt(11);

        showStats();
    }

    public void showStats() {
        System.out.println(name+":   Hull: "+hull+"   Shields: "+shield+"   Beam Weapons: "+beam+"   Torpedoes: "+torpedoe);
    }
}
