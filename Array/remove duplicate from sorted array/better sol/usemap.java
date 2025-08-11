
import java.util.*;

public class usemap {
    public static int remove(int a[]){
        Set<Integer> hs=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        int k=hs.size();
        int j=0;
        for (var elem : hs) {
            a[j++]=elem;
        }
        return k;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,2,2,2,3,3,3,4,4,5};
        int ans=remove(a);
        for (int i = 0; i <ans; i++) {
            System.out.println(a[i]);
        }
    }
}
