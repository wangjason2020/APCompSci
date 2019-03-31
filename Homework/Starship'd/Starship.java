public abstract class Starship {

    protected String name;

    protected int hull,shield,beam,torpedoe;

    public void showStats() {
        System.out.println(name+":   Hull: "+hull+"   Shields: "+shield+"   Beam Weapons: "+beam+"   Torpedoes: "+torpedoe);
    }
}
