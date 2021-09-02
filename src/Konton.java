import java.util.Scanner;

public class Konton {
    private static double balance;
    //set balance to 0
    public  Konton(){
        balance = 0.0;
    }

    //deposit
    public static void deposit(double amount){
        boolean dep = true;
        while (dep) {

            if (amount > 10000000) {
                System.out.println();
                System.out.println("You cannot deposit that much money");
                System.out.println("Choose a smaller amount");
                System.out.println();
                dep = false;
            }
            else{
                balance = balance + amount;
                System.out.println();
                System.out.println("Insättningen lyckades =)");
                System.out.println("Vad vill du göra härnäst");
                System.out.println();
                dep = false;


            }
        }

    }

    // withdraw
    public static void withdraw(double amount){
        boolean dep = true;
        while (dep) {


            if (amount >= balance - 100) {
                System.out.println();
                System.out.println("You cannot withdraw that much money");
                System.out.println("Choose a smaller amount");
                System.out.println();
                dep = false;
            }
            else{
                balance = balance - amount;
                System.out.println();
                System.out.println("Uttaget lyckades =)");
                System.out.println("Vad vill du göra härnäst");
                System.out.println();

                dep = false;

            }
        }
    }

    //Get balance
    public static double getBalance(){
        return balance;


    }


}
