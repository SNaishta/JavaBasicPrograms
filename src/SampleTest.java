public class SampleTest {

    public static void main(String[] args) {

        String s = "ABC";
        permuatation("" , s);
    }

    private static void permuatation(String emptyString, String toPermutate) {
        if(toPermutate.length()==0) {
            System.out.println(emptyString);
        }

        for(int i=0; i<toPermutate.length(); i++) {
            String fixedChar = emptyString+toPermutate.charAt(i);
            String remaining = toPermutate.substring(0,i) + toPermutate.substring(i+1);
            permuatation(fixedChar,remaining);
        }
    }
}
