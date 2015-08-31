package Missing.Number.done;

import java.util.Arrays;

public class Solution {
	public int missingNumber(int[] nums) {
		java.util.Arrays.sort(nums);
		int len = nums.length;
		int mid = len / 2;
		if (nums.length == 1) {
			if (nums[0] == 1) {
				return 0;
			}
			return nums[0] + 1;
		} else if (nums[len - 1] - nums[0] <= len - 1) {
			if (nums[0] == 1) {
				return 0;
			}
			return nums[len - 1] + 1;
		} else if (nums[len - 1] - nums[0] > len) {
			return 0;
		} else if (len == 2) {
			if (nums[0] - nums[1] + 2 == 0) {
				return 1 + nums[0];
			} else if (nums[1] - nums[0] == 2) {
				return nums[0] - 1;
			} else {
				return 0;
			}
		} else if (nums[mid] > mid + nums[0]) {
			int temp = missingNumber(Arrays.copyOfRange(nums, 0, mid + 1));
			return temp;
		} else {
			int temp2 = missingNumber(Arrays.copyOfRange(nums, mid, len));
			return temp2;
		}
	}
}
