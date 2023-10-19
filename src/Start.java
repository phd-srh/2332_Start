import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Wie ist Ihr Name: ");
        String name = eingabe.nextLine();
        System.out.println("Hallo " + name + ", was geht!?");
    }
}
