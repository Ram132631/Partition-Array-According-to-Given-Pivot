import java.util.Arrays;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int i = 0;
        int j = n - 1;
        while (i < n) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }
            if (nums[j] > pivot) {
                ans[right--] = nums[j];
            }
            i++;
            j--;
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] result = sol.pivotArray(nums, pivot);
        System.out.println("Result: " + Arrays.toString(result));
    }
}