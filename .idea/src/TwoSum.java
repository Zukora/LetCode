public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {0, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {
            3, 7, 11, 15
        };
        int target = 18;
        int[] twoSum = twoSum(nums, target);
        System.out.println(String.format("[%s;%s]",twoSum[0],twoSum[1]));
    }
}
