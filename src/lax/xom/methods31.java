package lax.xom;

public class methods31 {
    static int logic(int a,int b){
        // instead of a ,b kuch bhi ho skta hai,,wo value copy ho jaati hai code se
        int c;
        if(a>b){
            c=a+b;
        }else{
            c=(a+b)*4;
        }
        return c;
    }

    public static void main(String[] args) {
        int a=4;
        int b=3;
        int c;
        c=logic(a,b);
        int a1=4;
        int b1=5;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
