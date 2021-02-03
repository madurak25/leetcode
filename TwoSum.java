package easy;

import java.util.HashMap;

public class TwoSum {
	public int[] twosum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int diff = target - nums[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
				}
			map.put(nums[i], i);
			}
		throw new IllegalArgumentException("No two sum solution");
	}
}
