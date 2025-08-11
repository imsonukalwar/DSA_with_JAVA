import java.util.*;
public class sol {
        public static int[] unionarray(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hs.add(nums2[i]);
        }
        int[] union = new int[hs.size()];
        int i = 0;
        for (int el : hs) {
            union[i++] = el;
        }

        return union;
    }
    public static void main(String[] args) {
        int a1[]={1,1,2,2,3,3,4,5,6,7};
        int a2[]={4,6};
        int ans[]=unionarray(a1,a2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
