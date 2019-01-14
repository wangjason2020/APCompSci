public class Main {

    public static String palindrome="Palindrome";
    public static String civic="Civic";
    public static String radar="Radar";
    public static String level="Level";
    public static String eva="Eva, can I stab bats in a cave?";
    public static String man="A man, a plan, a canal, Panama";
    public static String owl="Mr. Owl ate my metal worm";
    public static String odd="Never odd or even";
    public static String doc="Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.";
    public static boolean palindromeTest;

    public static void main(String[] args) {
        palindromeTester(palindrome);
        palindromeTester(civic);
        palindromeTester(radar);
        palindromeTester(level);
        palindromeTester(eva);
        palindromeTester(man);
        palindromeTester(owl);
        palindromeTester(odd);
        palindromeTester(doc);
    }

    public static boolean palindromeTester(String a) {
        int len=a.length();
        String flipped="";
        String original="";

        for (int i=0; i==len; i++) {
            if (a.charAt(i) == '.' || a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '?' || a.charAt(i) == '!' || a.charAt(i) == ':' || a.charAt(i) == ';') {
                original += "";
            }
            else {
                original += a.charAt(i);
            }
        }

        for (int i=len-1; i>=0; i--) {
            if (a.charAt(i) == '.' || a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '?' || a.charAt(i) == '!' || a.charAt(i) == ':' || a.charAt(i) == ';') {
                flipped += "";
            } else {
                flipped += a.charAt(i);
            }
        }
            if (flipped.equalsIgnoreCase(original)) {
                palindromeTest=true;
            }
            else {
                palindromeTest=false;
            }

        System.out.println(palindromeTest);
        return palindromeTest;
    }
}
