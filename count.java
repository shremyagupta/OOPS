public class count {

    public static int countDigitOne(int n) {
        if (n <= 0) return 0;

        int count = 0;
        long digit = 1;

        while (digit <= n) {
            long high = n / (digit * 10);
            long cur = (n / digit) % 10;
            long low = n % digit;

            if (cur == 0) {
                count += high * digit;
            } else if (cur == 1) {
                count += high * digit + low + 1;
            } else {
                count += (high + 1) * digit;
            }

            digit *= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n1 = 13;
        System.out.println("Input: " + n1 + " → Output: " + countDigitOne(n1));

        int n2 = 0;
        System.out.println("Input: " + n2 + " → Output: " + countDigitOne(n2));  
    }
}
