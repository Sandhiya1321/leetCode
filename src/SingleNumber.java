public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = {2, 2, 1, 4, 1, 4, 6};
        int singleNumber = solution.singleNumber(nums);
        System.out.println("Single Number: " + singleNumber);
    }
}

