import java.util.Scanner;

public class Banken {
    public static Scanner minScanner = new Scanner(System.in);

    public static void chooseUser(){

        System.out.println("Welcome!");
        System.out.print("Var vänlig skriv in ditt 5-siffriga personliga ID :");
        boolean vilketKonto = true;
        while(vilketKonto) {
                int usercheck = minScanner.nextInt();

                if(usercheck == Kunder.kund1.personalId){
                    System.out.println("Välkommen " + Kunder.kund1.användare + ", Vad vill du göra idag?!");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(" ");
                    }
                    Banken.meny();

                }
                else {
                    System.err.println("Tyvärr användaren finns inte");

                }
        }


    }

    public static void avsluta(){
        System.out.println("Tack för denna gången!");
        System.out.println("Välkommen åter");
        System.exit(0);
    }



    public static void meny(){
        while(true) {
            System.out.println("*****************");
            System.out.println("1. Visa Saldo");
            System.out.println("*****************");
            System.out.println("2. Sätt in pengar");
            System.out.println("*****************");
            System.out.println("3. Ta ut pengar");
            System.out.println("*****************");
            System.out.println("4. Avsluta bankprogrammet");
            System.out.println("*****************");

            int doMenu = minScanner.nextInt();
            switch (doMenu) {
                case 1:
                    System.out.println();
                    System.out.println("Ditt saldo är: " + Konton.getBalance());
                    System.out.println();

                    break;
                case 2:
                    System.out.print("Hur mycket vill du sätta in: ");
                    Konton.deposit(minScanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Hur mycket vill du ta ut: ");
                    Konton.withdraw(minScanner.nextDouble());
                    break;
                case 4:
                    avsluta();
                    break;
                default:
                    System.out.println("Ogiltigt alternativ!");
                    break;



            }
        }


    }



}
