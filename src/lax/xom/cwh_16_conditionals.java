package lax.xom;
import java.util.Scanner;
public class cwh_16_conditionals {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age of the student");
        int age =sc.nextInt();
        if (age>18){
            System.out.println("you can drive GADI");
        }
        else{
            System.out.println("you cannot drive the gaadi,first go and make your licenceeee");
        }
    }
}
