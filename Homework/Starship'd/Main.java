import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Overall available fleet: ");
        ArrayList<Starship> ships=new ArrayList<Starship>();
        ships.add(new Escort("Reliant"));
        ships.add(new Escort("Enterprise"));
        ships.add(new Escort("Yorktown"));
        ships.add(new Escort("Saratoga"));
        ships.add(new Escort("Voyager"));
        ships.add(new Frigate("Discovery"));
        ships.add(new Frigate("Constitution"));
        ships.add(new Frigate("Constellation"));
        ships.add(new Frigate("Grissom"));
        ships.add(new Frigate("Defiant"));
        ships.add(new Cruiser("Intrepid"));
        ships.add(new Cruiser("Britaan"));
        ships.add(new Cruiser("Stargazer"));
        ships.add(new Cruiser("Yamato"));
        ships.add(new Cruiser("Galaxy"));
        ships.add(new Battleship("Ambassador"));
        ships.add(new Battleship("Nimitz"));
        ships.add(new Battleship("Equinox"));
        ships.add(new Battleship("Relativity"));
        ships.add(new Battleship("Challenger"));

        ArrayList<Starship> offenseBattalion=new ArrayList<Starship>();
        ArrayList<Starship> defenseBattalion=new ArrayList<Starship>();

        System.out.println("Defense Batallion: ");
        for (Starship x: ships) {
            if (x instanceof IsDefense) {
                if (x.hull+x.shield>0 && defenseBattalion.size()<4) {
                    defenseBattalion.add(x);
                    x.showStats();
                }
            }
        }

        System.out.println("Offense Batallion: ");
        for (Starship x: ships) {
            if (x instanceof IsOffense) {
                if (x.hull+x.shield>0 && offenseBattalion.size()<4) {
                    offenseBattalion.add(x);
                    x.showStats();
                }
            }
        }
    }
}
