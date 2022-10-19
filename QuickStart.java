import java.util.Scanner;

class QuickStart {
    public static void main (String[] args) {
        // Openin the gate to find the user imputs.
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s! How old are you? ", name);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d is a perfect age to start coding! What is your favorite language? ", age);
        String language = scanner.nextLine();

        // It's not possible to use == inside the if? ".equals()" is a good substitute.
        if ( language.toLowerCase().equals("java")) System.out.printf("%s is the best!", language);
        else System.out.printf("%s is good but have you tried Java?(!)", language);

        // If not closed, the scanner keep listening open wide to all forms of hijacking.
        scanner.close();
    }
    
}