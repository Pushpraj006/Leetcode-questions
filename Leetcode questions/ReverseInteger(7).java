class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;

        }

      //CHECKING THE OVERFLOW CONDITION HERE
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int) rev;
    }
}
