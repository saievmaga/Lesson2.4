import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


    }

    public int search(Integer n, Integer[] arr) {
        Search search1 = (s, list) -> list.length > s ? list[s] : -1;
        return search1.search(n, arr);
    }

    public static String reverse(String s) {
        Reverse reverse1 = s1 -> {
            char[] str = s1.toCharArray();
            int start = 0;
            while (start < str.length / 2) {
                char current = str[start];
                str[start] = str[str.length - 1 - start];
                str[str.length - 1 - start] = current;
                start++;
            }
            return new String(str);
        };
        return reverse1.reverse(s);
    }

    public static Double average(List<Integer> list) {
        Average foo = (a, b) -> a / b;
        BigOrSmall sumLambda = (a, b) -> a + b;
        int sum = 0;
        for (Integer number : list) {
            sum = sumLambda.max(sum, number);
        }
        return foo.average(sum, list.size());
    }

    public static List<String> search(List<String> list) {
        Conditional conditional = s -> {
            List<String> ans = new ArrayList<>();
            for (String str : s) {
                if (str.length() == 3 && str.charAt(0) == 97) {
                    ans.add(str);
                }
            }
            return ans;
        };
        return conditional.condition(list);
    }

}