package leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		int[] nums = {1,2,4};
		int target = 3;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] {i, map.get(target - nums[i])};

			}
		}
		return null;

	}

}
