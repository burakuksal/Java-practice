public class Codingbatfix45 {
    public static void main(String[] args) {


    }

    public int[] fix45(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int k = 0; k < nums.length; k++) {
                    if (k == 0 && nums[k] == 5) {
                        nums[k] = nums[i + 1];
                        nums[i + 1] = 5;
                    } else if (nums[k] == 5 && nums[k - 1] != 4) {
                        nums[k] = nums[i + 1];
                        nums[i + 1] = 5;
                    }
                }
            }


        }
        return nums;

    }
}