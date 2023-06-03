import java.util.Arrays;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Increment the digit
                return digits;
            } else {
                digits[i] = 0;  // Set the digit to 0 and continue to the next digit
            }
        }
        
        // If all digits are 9, we need to add an additional digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;  // Set the first digit to 1
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
