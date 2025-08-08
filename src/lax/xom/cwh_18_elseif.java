package lax.xom;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = sc.nextInt();
        if (age>27){
            System.out.println("you are not capable for ssc exam");
        } else if (age>18) {
            System.out.println("you are eligible for ssc exam");
        }
        else{
            System.out.println("Bhag jao,pahle abde hokr aao bacche");

        }
    }
}
