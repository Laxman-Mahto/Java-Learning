package SOLVEDQUES;
import java.util.Random;
import java.util.Scanner;


public class ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock, Paper, Scissor game");
        Scanner sc = new Scanner (System.in);
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissor");
        System.out.print("Select the number: ");
        int num = sc.nextInt();

//Assigning values to user choice

        System.out.print("You selected: ");
        switch (num) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("Scissor");
        }

//Taking random number input from computer
        Random random = new Random();
        int number = random.nextInt(3)+1;

//Assigning values to computer choice
        System.out.print("The computer selected: ");
        switch (number){
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("Scissor");
        }

//Givig logic to our numbers
        if(number==num){
            System.out.println("DRAW");
        }
        else if (num==1 && number==2){
            System.out.println("You lost");
        }
        else if (num==1 && number==3){
            System.out.println("You Won");
        }
        else if (num==2 && number==1){
            System.out.println("You Won");
        }
        else if (num==2 && number==3){
            System.out.println("You lost");
        }
        else if (num==3 && number==1) {
            System.out.println("You lost");
        }
        else if (num==3 && number==2) {
            System.out.println("You won");
        }

    }
}

