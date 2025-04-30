public class NumtoW {
    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                                          "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                                          "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    
    private final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    private final String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        String result = "";
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                result = helper(num % 1000) + thousands[i] + " " + result;
            }
            num /= 1000;
            i++;
        }

        return result.trim();
    }

    private String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return belowTwenty[num] + " ";
        else if (num < 100)
            return tens[num / 10] + " " + helper(num % 10);
        else
            return belowTwenty[num / 100] + " Hundred " + helper(num % 100);
    }
    public static void main(String[] args) {
        NumtoW sol = new NumtoW();
        System.out.println(sol.numberToWords(123));        
        System.out.println(sol.numberToWords(12345));     
        System.out.println(sol.numberToWords(1234567));    
    }
}
