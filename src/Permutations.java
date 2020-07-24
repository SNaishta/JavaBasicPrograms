public class Permutations {

    private static void permutations(String emptyStr, String toPermutate) {
        if (toPermutate.length() == 0) {
            System.out.println(emptyStr);
        }

        for (int i = 0; i < toPermutate.length(); i++) {
            String fixedChar = emptyStr + toPermutate.charAt(i);
            String remaining = toPermutate.substring(0, i) + toPermutate.substring(i + 1);

            permutations(fixedChar, remaining);
        }
    }

    public static void main(String[] args) {
        String s = "ABCDE";
        permutations("", s);
    }
}


