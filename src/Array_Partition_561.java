import java.util.Arrays;

public class Array_Partition_561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;

        for (int i = 0; i < nums.length; i=i+2) {
            ans = ans + nums[i];
        }
        return ans;
    }
}
