package lax.xom;

public class cwh32_methodoverloading {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a, int b){ //int a,int b yaha parameter hai
        System.out.println("good morning " + a + " bro");
        System.out.println("good night " + b + " bro");
        // arguments are actual values
    }












    static void change(int a){
        a=94;
    }
    static void change2(int []arr){
        arr[0]=11;
    }






    static void joke(){
        System.out.println("i am flying in the cycle");
    }    public static void main(String[] args) {
        //joke();
//        int [] marks={110,29,49,38,50,74};
//        case 1 changing the integer
//        int x=54;
//        change(x);
//        System.out.println("the value of x after running change is"+x);
//          case 2 changing the array
//          int []marks={98,97,87,89,76,57,46};
//          change2(marks);
//          System.out.println("the value of x after runnning change :" + marks[0]);






        //METHOD OVERLOADING
        foo();
//        foo(300);
        foo(400,500); // 400,500 arguments hai


    }
}
