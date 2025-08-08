package lax.xom;
import java.util.Scanner;

public class cwh_06_calc {
    public static void main(String[] args) {
        // WRITE A PROGRAM TO CALCULATE PERCENTAGE ....
        Scanner sc = new Scanner(System.in);
        float Math,Chemisty,Physics,English;
        System.out.println("Enter the marks of maths");
        float a =sc.nextFloat();
        System.out.println("Enter the marks of chemistry");
        float b =sc.nextFloat();
        System.out.println("Enter the marks of physics");
        float c =sc.nextFloat();
        System.out.println("Enter the marks of english");
        float d =sc.nextFloat();
        float sum =(a+b+c+d);
        float percentage =sum/400*100;
        System.out.println("The total percentage is ");
        System.out.println(percentage);
    }
}
