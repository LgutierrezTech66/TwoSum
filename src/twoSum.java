import java.util.HashMap;
//Two Sum Practice problem

//view TwoSomeQ in readme
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] defaultResult = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                int[] result = {map.get(target - nums[i]), i};
                return result;
            }
            map.put(nums[i], i);
        }
        return defaultResult;
    }
}
