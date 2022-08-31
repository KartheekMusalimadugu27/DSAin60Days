package intergers;

// Leetcode 9
public class PalindromeNumber {

    public static void main(String[] args) {

    }


    public static boolean palindrome(int x) {

        // if x < 0 or last digit is 0 when x is greater than zero return false
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int rev = 0;
        int num = x;
        while (num > rev) {

            int lastDigit = num % 10;

            rev = rev * 10 + lastDigit;

            num = num / 10;

        }


        return num == rev / 10 || num == rev;
    }

}

//121
//num=1 and rev=12
//1221
//num=12 and rev=12


// O(logn) and SC:O(1)