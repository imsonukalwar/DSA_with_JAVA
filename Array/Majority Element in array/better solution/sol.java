import java.util.HashMap;

//using hashmap
public class sol {
    public static int majority(int nums[]) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // Searching for the element with maximum frequency
        int maxFreq = 0, ans = -1;
        for (int key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ans = key;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,2,4,3,4,4,3,2,4,2,7,2,8,2,3,2};
        int ans = majority(nums);
        System.out.println(ans);
    }
}
