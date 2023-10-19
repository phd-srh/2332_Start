public class Start {
    public static void main(String[] args) {
        // Eingabe
        int a = 21232325;
        int b = 9235;

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
