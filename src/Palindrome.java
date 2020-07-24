import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String original;
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter the string --- > ");

        original = s.next();
        int length = original.length();

        if(validatePalindromeBuffer(original)) {
            System.out.println("Palindrome");
        } else System.out.println("Not a Palindrome");

        if(validatePalindrome(original, length)) {
            System.out.println("Palindrome");
        } else System.out.println("Not a Palindrome");
    }

//    Option 1 : to use for loop with StringBuilder
    private static Boolean validatePalindrome(String original, int length) {
        StringBuilder reverse = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }
        return reverse.toString().equalsIgnoreCase(original);
    }

//    Option 2 : to use String buffer
    private static boolean validatePalindromeBuffer(String original) {
        StringBuffer sReverse = new StringBuffer(original);
        String temp = String.valueOf(sReverse.reverse());
        return temp.equalsIgnoreCase(original);
    }
}
