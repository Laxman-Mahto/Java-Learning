package lax.xom;

public class cwh_14_stringsmethod {
    public static void main(String[] args) {
        String name = "Laxman";
        System.out.println(name);
        // for string length
        int value = name.length();
        System.out.println(value);

        //for all small (lowercase)
        String l = name.toLowerCase();
        System.out.println(l);

        //for all upper case
        String q = "hanuman";
        String e = q.toUpperCase();
        System.out.println(e);

        //for some next element by indexing
        String b = "mahto";
        String x = b.substring(3);
        System.out.println(x);

        String p = "kjdnfjfbreber";
        String z = p.substring(0);
        String d = p.substring(1,6);
        System.out.println(name.substring(1,5));
        System.out.println(d);
        String t = p.toUpperCase();
        System.out.println(z);
        System.out.println(t);
        //replace
        System.out.println(p.replace('k','p'));
        //boolean
        System.out.println(p.startsWith("kjd"));
        System.out.println(p.endsWith("pr"));

        System.out.println(p.charAt(2));














    }
}
