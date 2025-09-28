class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }

        return original == reverse;
    }
}
