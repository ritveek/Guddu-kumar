import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Problem_4 {

    public static void main(String[] args) {
        List<Integer> givenNumbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int i = 1; i<=9; i++) {
            result.put(i, 0);
        }

        for (int num : givenNumbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }
        System.out.println(result);
    }
}
