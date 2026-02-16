package prac;
import java.util.Scanner;

public class dowhillwww5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. say hello laxman");
            System.out.println("2. kishann");
            choice =sc.nextInt();

            if (choice == 1) {
                System.out.println("hello!");
            }
        } while (choice != 2);
        System.out.println("program ended");


    }
}
