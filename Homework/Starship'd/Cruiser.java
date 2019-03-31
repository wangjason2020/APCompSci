import java.util.Random;

public class Cruiser extends Starship implements IsOffense {

    public Cruiser(String newName) {

        name=newName;

        Random rand=new Random();

        hull=2000+rand.nextInt(501);
        shield=2000+rand.nextInt(501);
        beam=3000+rand.nextInt(1001);
        torpedoe=20+rand.nextInt(16);

        showStats();
    }

    public void showStats() {
        System.out.println(name+":   Hull: "+hull+"   Shields: "+shield+"   Beam Weapons: "+beam+"   Torpedoes: "+torpedoe);
    }
}
