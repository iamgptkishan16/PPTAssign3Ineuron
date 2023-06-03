public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        
        // XOR operation cancels out duplicate elements
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int result = singleNumber(nums);
        System.out.println("Single number: " + result);
    }
}
