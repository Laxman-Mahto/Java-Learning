package SOLVEDQUES;

public class cwh_15_practiceset {
    public static void main(String[] args) {

        // QUESTION 1.
        String uni = "university of engineering anf management";
        uni = uni.toLowerCase();
        System.out.println(uni);
        //or
        System.out.println(uni.toUpperCase());

        //QUESTION 2
        String text = "university of engineering and management";
        text = text.replace(" ","_");
        System.out.println(text);

        //QUESTION 3
         String change= "Dear |<harry>| ,Thanks alot!";
         change = change.replace("|<harry>|","laxman");
         System.out.println(change);

         //QUESTION 4
        String nama =" this string contain dobuble  and triple   spaces";
        System.out.println(nama.indexOf("  "));
        System.out.println(nama.indexOf("   "));

        //QUESTION 5
        String back ="Dear harry,\n\t I just wanted to thank you,\n\t You r too good.";
        System.out.println(back);


    }
}
