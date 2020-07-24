import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integers for the array -->");

        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        int n = numbers.size();
        System.out.println(isTriplet(numbers, n));
    }

    private static boolean isTriplet(List<Integer> numbers, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = numbers.get(i) * numbers.get(i), y = numbers.get(j) * numbers.get(j), z = numbers.get(k) * numbers.get(k);
                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }
        return false;
    }
}
