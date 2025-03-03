class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int j = 0; j < nums.length; j++) {
            for(int i = j + 1; i < nums.length; i++) {
                if(nums[j] + nums[i] == target) {
                    return new int[] {j, i};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class twoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
