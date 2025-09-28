class Solution {
    public double myPow(double x, int n) {
        long bitnum = n;
        if (bitnum < 0) {
            bitnum = -bitnum;
            x = 1.0 / x;
        }

        double ans = 1.0;
        while (bitnum > 0) {
            if (bitnum % 2 == 1)
                ans *= x;
            x *= x;
            bitnum /= 2;
        }
        return ans;
    }
}
