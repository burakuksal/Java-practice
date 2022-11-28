public class CodingBatcountClumps{
    public static void main(String[] args) {


    }

    public int countClumps(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] &&
                    (i == 0 || nums[i - 1] != nums[i])) {
                count++;
            }
        }
        return count;
    }


}

