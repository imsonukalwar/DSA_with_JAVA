
import java.util.*;
public class usehas {
    public static int sol(int a[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (var elem : a) {
            mp.put(elem , mp.getOrDefault(elem,0)+1);
        }
        for (var num : mp.keySet()) {
            if(mp.get(num)==1){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,4,5,5,6,6};
        int ans=sol(a);
        System.out.println(ans);
    }
}
