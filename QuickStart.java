import java.util.Scanner;

class QuickStart {
    public static void main (String[] args) {
        // Openin the gate to find the user imputs.
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();

        System.out.printf("You are %s! What a stupid name!", name);

        // If not closed, the scanner keep listening open wide to all forms of hijacking.
        scanner.close();
    }
    
}