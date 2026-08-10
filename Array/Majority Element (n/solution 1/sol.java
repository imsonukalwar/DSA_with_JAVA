
import java.util.*;
public class sol{
    public static int[] mojority(int a[]){
        HashMap<Integer,Integer>hs=new HashMap<>();
        for (int i = 0; i <a.length; i++) {
            hs.put(a[i],hs.getOrDefault(a[i], 0)+1);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for (var elem : hs.keySet()) {
            if (hs.get(elem) > a.length / 3) {
                li.add(elem);
            }
        }
        int[] ans = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            ans[i] = li.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={11,13,13,11,13,11};
        int ans[]=mojority(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}