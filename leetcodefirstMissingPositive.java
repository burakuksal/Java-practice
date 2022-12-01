import java.util.Arrays;

public class leetcodefirstMissingPositive {


    public static void main(String[] args) {


    }

    public static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 1)) {
                for (int k = i; k < nums.length - 1; k++) {
                    if (!(nums[k + 1] - nums[k] == 1)) {
                        return nums[k] + 1;
                    } else return nums[k + 1] + 1;

                }
            }
        }

        return 1;
    }
}