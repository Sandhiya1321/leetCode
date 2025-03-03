class Sol {
    public boolean isPalindrome(int x) {
        int n = 0;
        int temp = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int digit = x % 10;
            n = n * 10 + digit;
            x = x / 10;
        }
        return temp == n;
    }
}

public class palindrome{
    public static void main(String[] args) {
        Sol sol = new Sol();

        // Test cases
        int[] testCases = {121, -121, 10, 12321, 0};

        for (int testCase : testCases) {
            boolean result = sol.isPalindrome(testCase);
            System.out.println("Is " + testCase + " a palindrome? " + result);
        }
    }
}
