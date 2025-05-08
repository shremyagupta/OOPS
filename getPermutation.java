import java.util.*;

public class getPermutation {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;
        }
        k--;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            fact = fact / (n - i);
            int index = k / fact;
            result.append(numbers.get(index));
            numbers.remove(index);
            k = k % fact;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        getPermutation solution = new getPermutation();
        System.out.println(solution.getPermutation(3, 3)); 
        System.out.println(solution.getPermutation(4, 9)); 
    }
}
