package az.turingacademy.module02.lesson09;

public class Test {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j=0;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " "+ nums[j]);
                    System.out.println(i +" " + j);
                }
            }
        }
    }
    public int[] twoSum(int[] nums, int target) {
        nums = new int[]{2, 7, 11, 15};
        target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
