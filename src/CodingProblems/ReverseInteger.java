package CodingProblems;

/**
 * LeetCode Problem #7 Reverse Integer
 */
public class ReverseInteger {
    public int reverse(int x) {

        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = x * (-1);
        }
        int temp = x;
        int mod;
        long digit = 0;
        while (temp >= 1){
            mod = temp % 10;
            temp = temp /10;
            if (digit*10 + mod > Integer.MAX_VALUE) {
                digit = 0;
                break;
            }
            else {
                digit = digit*10 + mod;
            }
        }

        if (!flag) {
            digit = digit * (-1);
            return (int) digit;
        }
        else {
            return (int) digit;
        }
    }
}
