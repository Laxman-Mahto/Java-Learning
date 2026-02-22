package lax.xom;

public class cwh34_recursion {
    // factorial 0 = 1
    // || means or
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }







    public static void main(String[] args) {
        int x=4;
        System.out.println("the value of factorial x is: " + factorial(x));


    }
}
// try fibonacci series..means the next no is the sum of previous two number.