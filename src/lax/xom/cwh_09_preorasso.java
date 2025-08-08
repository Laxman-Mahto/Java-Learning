package lax.xom;

public class cwh_09_preorasso {
    public static void main(String[] args) {
        // Precendence $ Associativity
        int a = 6*5-34/2;
        /* Highest precednece goes to * and / . they are then
        evaluated on the basis of left to right associativity
                =30-34/2
                =30-17
                =13
        */
        int b = 60/5-34*2;
        /*
              =12_234*3
              =12-68
              =-56
        */
        //System.out.println(a);
        //System.out.println(b);
        // Quick Quiz
        int x = 6;
        int y = 1;
        int k = x * y/2;
        //System.out.println(k);

        int a1 = 5;
        int b1 = 4;
        int c1=5;
        k=b1*b1-(4*a1*c1)/(2*a1); //parenthesis lagane par alag value aati hai an dnahai lagane par different value aati hai
        System.out.println(k);

    }
}
