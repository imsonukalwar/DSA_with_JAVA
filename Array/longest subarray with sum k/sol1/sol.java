
public class sol {
        public static int longestSubarray(int[] a, int k) {
            int mc=0;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                    sum+=a[j];
                if(sum==k)
                mc=Math.max(mc,j-i+1);
            }
        }
        return mc;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,1,4,2,3};
        int ans=longestSubarray(a, 5);
        System.out.println(ans);
    }
}
