import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence :");

        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("[^a-zA-Z]","");
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                count++;
            }
        }
        System.out.println("Number of vowels in the given sentence is " + count);
    }
}

