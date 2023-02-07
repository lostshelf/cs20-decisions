import java.util.*;
public class Main {
    public static void main(String[] args) {
        two();
        four();
        six();
        eight();
    }
    static void two() {
        Random rand = new Random();

        // Limit the number to be between 1 and 10
        // I add 1 to the number otherwise it would only be from 0-9 and not 1-10
        int num = rand.nextInt(10) + 1;

        if (num > 5)
            System.out.println("The number is greater than five.");
    }
    static void four() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like milk or ice cream?: ");
        String item = scan.nextLine().trim().toLowerCase();

        System.out.print("How much does the " + item + " cost?: ");
        double price = Double.parseDouble(scan.nextLine().trim());

        if (item.equals("ice cream"))
            // Shortcut for applying tax to an item, same as multiplying the original price by 0.05 and adding it back
            // to the original price
            price *= 1.05;

        System.out.println("Total price for the " + item + " is " + price + ".");
    }
    static void six() {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you?: ");

        // Too lazy to reformat code to handle the error case; hopefully you won't enter something invalid?
        int age = Integer.parseInt(scan.nextLine().trim());

        // Exit early if they are younger than 16
        if (age < 16) {
            System.out.println("You are not allowed to drive: must be 16 or older.");
            return;
        }

        System.out.print("Have you passed the drivers road test? (y/n): ");
        char passed = scan.nextLine().trim().charAt(0);

        // Forces user to pass the drivers test to be eligible
        if (passed != 'y') {
            System.out.println("You are not allowed to drive: must pass road test.");
            return;
        }

        // Since the above checks returns if not eligible, since the code reached this far, the user has to be eligible for a driver's license
        System.out.println("You are eligible to drive!");

    }
    static void eight() {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your Computer Science mark?: ");
        int csMark = Integer.parseInt(scan.nextLine().trim());

        if (csMark >= 80)
            System.out.println("A");
            // If this runs, I know that the mark is not greater than or equal to 80, so it has to be less than 79 so if I
            // check is it is greater than 70, it is the same as checking if 80 > csMark >= 70
            // This logic continues for the rest of the chain
        else if (csMark >= 70)
            System.out.println("B");
        else if (csMark >= 60)
            System.out.println("C");
        else if (csMark >= 50)
            System.out.println("D");
        else
            System.out.println("F");
    }
}