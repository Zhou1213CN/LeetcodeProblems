class Solution {
    public int reverse(int x) {
        int result = 0;
        int temp = 0;
        while (x != 0){
            if (result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10) return 0;
            temp = x % 10;
            x /= 10;
            result = result*10+temp;
        }
        return result;
    }

    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}