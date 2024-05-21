package Esercizio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola.");
        String word = scanner.nextLine();
        String[] arrayOfAWord = word.split("");

        while (word != ":q") {
            String[] newArray = new String[arrayOfAWord.length];
            for (int i = 0; i < arrayOfAWord.length; i++) {
                newArray[i] = arrayOfAWord[i] + ",";
                System.out.println(newArray[i]);
            }
            System.out.println("Inserisci una parola.");
            word = scanner.nextLine();
        }
        scanner.close();
    }

}
