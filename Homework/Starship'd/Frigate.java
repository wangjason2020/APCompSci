import java.util.Random;

public class Frigate extends Starship implements IsDefense {

    public Frigate(String newName) {

        name=newName;

        Random rand=new Random();

        hull=1500+rand.nextInt(501);
        shield=2000+rand.nextInt(501);
        beam=2500+rand.nextInt(1001);
        torpedoe=20+rand.nextInt(11);

        showStats();
    }

    public void showStats() {
        System.out.println(name+":   Hull: "+hull+"   Shields: "+shield+"   Beam Weapons: "+beam+"   Torpedoes: "+torpedoe);
    }
}
