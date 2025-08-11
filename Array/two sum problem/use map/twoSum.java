
import java.util.HashMap;
import java.util.Map;

public  class twoSum{
    public static int[] sum(int a[],int target){
        Map<Integer,Integer>mp=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x=target-a[i];
            if(mp.containsKey(x)){
                return new int[]{i,mp.get(x)};
            }
            mp.put(a[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = sum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}