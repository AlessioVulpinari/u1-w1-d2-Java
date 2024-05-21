package Esercizio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero.");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 0:
                System.out.println("zero");
                break;

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("Errore: inserisci un numero da 0 a 3!");
        }
        scanner.close();
    }

}
