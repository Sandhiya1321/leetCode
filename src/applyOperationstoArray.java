import java.util.Arrays;

class applyOperationstoArray {


    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=zero){
                    int temp=nums[zero];
                    nums[zero]=nums[i];
                    nums[i]=temp;
                }
                zero++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        applyOperationstoArray app=new  applyOperationstoArray();
        int[] nums={1,2,2,1,1,0};
        System.out.println(Arrays.toString(app.applyOperations(nums)));
    }

}