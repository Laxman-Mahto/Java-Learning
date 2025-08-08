package lax.xom;
import java.util.Scanner;

public class cwh_18_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number which you want to print-");
        int day=sc.nextInt(); //int,string,char kuch bhi us ekr skte ho but uske according thoda fomat chnge hoga.
        switch (day){
            case 1:
                System.out.println("Hii ,My name is laxman");
                System.out.println("And i am pursuing B.Tech degree from uem uni.");
                break;
                case 2:
                    System.out.println("Today is Tuesday");
                    break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                break;


        }
        System.out.println("Have a good day sir!"); // ye break k bahar aane k bad print hoga automatically
    }
}

// use break in switch case is mandatory, because if you won't use break it will givee the output of all the case
//together ,so when you use break and when you type the number for monday then where the 1 match at that
//it will stop just cos of break.


// and it is used when we haveto make a choice from givean a number of alternatives variables