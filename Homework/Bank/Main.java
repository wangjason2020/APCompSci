import java.util.Scanner;

public class Main {

    public static int balance=500;

    public static void main(String[] args) {

        viewBalance();
        atm();
        deposit();

    }

    public static void viewBalance() {
        System.out.println("Balance: $"+balance);
    }

    public static void atm() {
        Scanner sc=new Scanner(System.in);
        System.out.print("How much would you like to withdraw? ");
        int withdrawal=sc.nextInt();
        if (balance>=withdrawal) {
            balance-=withdrawal;
            System.out.println("Balance Remaining: $"+balance);
        }
        else {
            System.out.print("You do not have enough money to do this.");
        }
    }

    public static void deposit() {
        Scanner sc=new Scanner(System.in);
        System.out.print("How much would you like to deposit? ");
        int deposit=sc.nextInt();
        balance+=deposit;
        System.out.println("Balance Remaining: $"+balance);
    }
}
