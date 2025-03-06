

class missNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp_sum = n*(n + 1)/2;
        int sum=0;
        for(int i =0 ;i < n;i++){
            sum+=nums[i];
        }
        int missing= exp_sum - sum;
        return missing;
    }

    public static void main(String[] args) {
        missNum mis=new missNum();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(mis.missingNumber(nums));
    }
}

