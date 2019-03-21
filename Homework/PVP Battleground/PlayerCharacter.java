public abstract class PlayerCharacter {

    protected String name;

    protected int strength;
    protected int intelligence;
    protected int agility;

    protected int hp, hpmax;
    protected int mp, mpmax;

    private static int count;

    public PlayerCharacter() {
        System.out.println("A new player has been created.");
        count++;

    }

    public void showStats() {
        System.out.printf("HP: %3d/%3d\n", hp, hpmax);
        System.out.printf("MP: %3d/%3d\n", mp, mpmax);
        System.out.printf("STR: %3d INT: %3d AGI: %3d", strength, intelligence, agility);
    }

    public static int numCharacters() {
        return count;
    }
}
