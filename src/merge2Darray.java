import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class merge2Darray {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int ptr = 0, ptr1 = 0;

        while (ptr < nums1.length && ptr1 < nums2.length) {
            if (nums1[ptr][0] == nums2[ptr1][0]) {
                list.add(new int[]{nums1[ptr][0], nums1[ptr][1] + nums2[ptr1][1]});
                ptr++;
                ptr1++;
            } else if (nums1[ptr][0] < nums2[ptr1][0]) {
                list.add(new int[]{nums1[ptr][0], nums1[ptr][1]});
                ptr++;
            } else {
                list.add(new int[]{nums2[ptr1][0], nums2[ptr1][1]});
                ptr1++;
            }
        }

        while (ptr < nums1.length) {
            list.add(new int[]{nums1[ptr][0], nums1[ptr][1]});
            ptr++;
        }

        while (ptr1 < nums2.length) {
            list.add(new int[]{nums2[ptr1][0], nums2[ptr1][1]});
            ptr1++;
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {

       int[][] nums1 = {{1,2},
                        {2,3},
                        {4,5}};
       int[][] nums2 = {{1,4},
                        {3,2},
                        {4,1}};
       int[][] res= mergeArrays(nums1,nums2);
       for(int[] merge:res){
           System.out.println("["+merge[0]+", "+merge[1]+"]");
       }
    }
}

