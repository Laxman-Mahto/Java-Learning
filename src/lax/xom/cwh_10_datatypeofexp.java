package lax.xom;

public class cwh_10_datatypeofexp {
    public static void main(String[] args) {
        /* see form notes in proper
        R = b + s int
        R = S + i → int
        R = l + f flot
        R = i + f + float
        b+ by le fr float
        5+short double
        i   → inkger c cheracter2+long R= Cti int
        R = C+5 int
        R = l+d double
        R = f +d double
         */
        byte x= 5;
        int y = 4;
        short z= 5;
        int a =y+z;
        float b = 6.54f+x;
        System.out.println(b);
        //--------------------------------------------------------------------------------------

        //Increment and decrement operator
        int i = 65;
        int j = i++; // here first the value of i will be assigned to j then j will be increment

        int k = 65;
        int l = ++k; // but there the value of k will be increment then it will be assigned to l
        System.out.println(j);
        System.out.println(++j); // ab yaha j ka value incerement hoga
        System.out.println(l);

        char ch= 'a';
        System.out.println(++ch); // here the value of the ch will be b increment ho jyeega


    }
}
