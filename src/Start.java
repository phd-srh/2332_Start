import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        // Eingabe
        System.out.print("Geben Sie die Zahl a ein: ");
        int a = eingabe.nextInt();

        System.out.print("Geben Sie die Zahl b ein: ");
        int b = eingabe.nextInt();

        // Verarbeitung (Algorithmus)
        while ( a != b ) {
            if ( a > b ) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }

        // Ausgabe
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
