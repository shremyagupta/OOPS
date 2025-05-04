public class Wild {

        public boolean isMatch(String s, String p) {
            int m = s.length();
            int n = p.length();
    
            boolean[][] dp = new boolean[m + 1][n + 1];
    
    
            dp[0][0] = true;
    
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[0][j] = dp[0][j - 1];
                }
            }
    
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    char sc = s.charAt(i - 1);
                    char pc = p.charAt(j - 1);
    
                    if (pc == sc || pc == '?') {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (pc == '*') {
                        dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                    }
                }
            }
    
            return dp[m][n];
        }
    
        public static void main(String[] args) {
            Wild wm = new Wild();
    
            System.out.println(wm.isMatch("aa", "a"));     
            System.out.println(wm.isMatch("aa", "*"));    
            System.out.println(wm.isMatch("cb", "?a"));     
            System.out.println(wm.isMatch("adceb", "*a*b")); 
            System.out.println(wm.isMatch("acdcb", "a*c?b")); 
        }
    }
    
    
