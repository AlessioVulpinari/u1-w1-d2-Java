package Esercizio_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringaParioDispari("Babb"));
        System.out.println(annoBisestile(2100));
    }

    public static boolean stringaParioDispari(String word) {
        if ((word.length() % 2) == 0) {
            return true;
        } else return false;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
