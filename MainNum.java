import java.util.Random;
import java.util.Scanner;

public class MainNum {
    public static void main(String[] args) {
        int n = 0, guess = 0, tries = 0;
        char answer;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        do {
            n = rand.nextInt(100) + 1;
            do {
                System.out.print("Inserisci un numero: ");
                guess = scan.nextInt();
                scan.nextLine();
                if (guess < n) {
                    System.out.println("Il numero è maggiore.");
                } else if (guess > n) {
                    System.out.println("Il numero è minore.");
                }
                tries++;
            } while (guess != n);
            System.out.println("Hai indovinato in " + tries + " tentativi.");
            System.out.println("Vuoi fare un altro tentativo? S per sì.");
            answer = scan.next().charAt(0);
        } while (answer == 's' || answer == 'S');
        scan.close();
        System.out.println("Grazie per aver giocato!");
    }
}
