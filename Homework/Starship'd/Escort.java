import java.util.Random;

public class Escort extends Starship implements IsDefense {

    public Escort(String newName) {

        name=newName;

        Random rand=new Random();

        hull=1000+rand.nextInt(251);
        shield=2500+rand.nextInt(1001);
        beam=2500+rand.nextInt(501);
        torpedoe=10+rand.nextInt(11);

        showStats();
    }

    public void showStats() {
        System.out.println(name+":   Hull: "+hull+"   Shields: "+shield+"   Beam Weapons: "+beam+"   Torpedoes: "+torpedoe);
    }
}
