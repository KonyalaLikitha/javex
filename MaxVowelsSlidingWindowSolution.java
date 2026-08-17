public class MaxVowelsSlidingWindowSolution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int c = 0;
        
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)) == 1) {
                c++;
            }
        }
        
        max = c;
        
        for (int i = 1; i <= s.length() - k; i++) {
            char a = s.charAt(i + k - 1);
            char b = s.charAt(i - 1);
            
            if (isVowel(a) == 1) {
                c++;
            }
            if (isVowel(b) == 1) {
                c--;
            }
            
            max = Math.max(max, c);
        }
        
        return max;
    }

    int isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        MaxVowelsSlidingWindowSolution solver = new MaxVowelsSlidingWindowSolution();
        String s = "abciiidef";
        int k = 3;
        
        int result = solver.maxVowels(s, k);
        System.out.println("Result: " + result);
    }
}
