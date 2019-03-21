import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players=new ArrayList<PlayerCharacter>();
        Fighter playerA=new Fighter("Roadhog");
        Mage playerB=new Mage("Jaina");
        Paladin playerC=new Paladin("Uther");
        Priest playerD=new Priest("Mercy");

        for (PlayerCharacter x: players) {
            if (x instanceof Priest) {
                System.out.println("Here is a priest: ");
                ((Priest) x).showStats();
            }
        }
    }
}
