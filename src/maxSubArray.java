public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=Math.max(sum,sum+nums[i]);
            max=Math.max(max,sum);
        }
        System.out.println(max);

    }
}
