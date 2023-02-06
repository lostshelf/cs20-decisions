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

        // 11 instead of 10 as it is exclusive
        int randNum = rand.nextInt(1, 11);

        if (randNum > 5)
            System.out.println("The randomly generated number is greater than five.");
    }
    static void four() {

    }
    static void six() {

    }
    static void eight() {

    }
}