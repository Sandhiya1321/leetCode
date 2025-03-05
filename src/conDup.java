import java.util.Arrays;

class conDup {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        conDup con=new conDup();
        int[] nums={3,5,4,5,6,7,3,6};
        System.out.println(con.containsDuplicate(nums));
    }
}