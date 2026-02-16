package lax.xom;
import java.util.Scanner;
public class praccalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chemistry,maths,reasoning ;
        System.out.println("Enter the marks of the chemistry");
        float a=sc.nextFloat();
        System.out.println("enter the marks of the maths");
        float b = sc.nextFloat();
        System.out.println("enter the marks of the reasoning");
        float c = sc.nextFloat();
        float sum = (a+b+c);
        float percentage = sum/300*100 ;
        System.out.println("the percentage of students is");
        System.out.println(percentage);
    }


}
