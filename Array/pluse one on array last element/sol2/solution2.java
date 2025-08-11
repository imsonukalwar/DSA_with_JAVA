
public class solution2 {
    public static int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
            int[] digits = {9, 9, 9};
        int[] result =plusOne(digits);
    }
}
