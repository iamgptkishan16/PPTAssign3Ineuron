import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        
        // Handle the lower bound
        if (nums[0] > lower) {
            result.add(formRange(lower, nums[0] - 1));
        }
        
        // Handle the middle ranges
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                result.add(formRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }
        
        // Handle the upper bound
        if (nums[nums.length - 1] < upper) {
            result.add(formRange(nums[nums.length - 1] + 1, upper));
        }
        
        return result;
    }
    
    private static String formRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println("Missing Ranges: " + result);
    }
}
