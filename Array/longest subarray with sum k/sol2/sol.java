  import java.util.*;
public class sol {
        public static int longestSubarray(int[] a, int k) {
        int sum = 0, length = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                length = Math.max(length, i + 1);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i); 
            }

            if (map.containsKey(sum - k)) {
                length = Math.max(length, i - map.get(sum - k));
            }
        }

        return length;
    }
    public static void main(String[] args) {
        int a[]={10,5,2,7,1,-10};
        int ans=longestSubarray(a, 15);
        System.out.println(ans);
    }
}
