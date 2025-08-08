package lax.xom;
import java.util.Scanner;
public class chw_05_takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the these number is");
        System.out.println(sum);
//        boolean b1 = sc.hasNext();
//        System.out.println(b1);


    }
}
