package lax.xom;

public class cwh25prac {
    public static void main(String[] args) {
        //practice problem 1
//        int n = 4;
//        for (int i=n; i>0; i--){
        //           for(int j=0; j<i ;j++) {
        //               System.out.print("*"); //star onylmone line mai 4 print hoga
        //          }
        //         System.out.print("\n"); //ab star alag line maine print hoga sab

//        }

        //question number 2
//        int i =10;
//        int sum=0;
//        while (i<0){
//            System.out.println(sum);
//            sum= sum+i;
//             i+=2;
//        }
//        //question 3
//        int n=5;
//        for (int i =0; i<10; i++);
//        for (int i=1; i<=10 ;i++){
//            System.out.printf("%d X %d =%d\n", n, i, n * i);

        //problem 4
        //int n =10;
        //for (int i=10; i>=1; i--){
        // System.out.printf("%d X  %d=%d\n",n , i , n*i);
        //     System.out.println(n+"X"+i+"="+(n * i));
        //   }
        // }
        int n = 5;
        int i =1;
        int factorial = 1;
        while (i<=n){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);





    }
}
