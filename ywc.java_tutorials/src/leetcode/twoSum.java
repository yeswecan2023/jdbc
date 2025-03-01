package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		int[] nums = {1,2,4};
		int target = 3;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				int[] result = new int[] {i, map.get(target - nums[i])};
				System.out.println(Arrays.toString(result));
				return; 
			}
			map.put(nums[i], i);
		}
		System.out.println("Null");
	}

}
