package lax.xom;

public class cwh33_varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    //to aiss ktina method bnayenge han class mai .. toh for this we use args
    //so we use arr to solve this prob

    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }




    public static void main(String[] args) {
        System.out.println("the sum of 5 and 2 is " + sum(5,2));
        System.out.println("the sum of 4,5 and 7 is " + sum(4,5,7));
        System.out.println("the sum of 4,5,7 and 8 is " + sum(4,5,7 ,8));

    }
}
