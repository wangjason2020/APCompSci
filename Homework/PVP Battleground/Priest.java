import java.util.Random;

public class Priest extends PlayerCharacter {

    String name;

    private int charisma;

    public Priest(String newName) {
        name=newName;
        System.out.println("A priest named "+name+" has been created!");

        Random rand=new Random();

        strength=7+(rand.nextInt(6)+1);
        intelligence=15+(rand.nextInt(6)+1);
        agility=8+(rand.nextInt(6)+1);
        charisma=10+(rand.nextInt(6)+1);

        hp=hpmax=strength;
        mp=mpmax=intelligence+(2*charisma);
    }

    public void showStats() {
        System.out.printf("%s, a Mage:\n",name);
        System.out.printf("STR: %3d  INT: %3d  AGI: %3d  CHA: %3d\n",strength,intelligence,agility,charisma);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
    }
}
