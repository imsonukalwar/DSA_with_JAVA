public class sol{
    public static int [] rearrange(int nums[]){
        int ans[]=new int [nums.length];
        int neg[]=new int [nums.length/2];
        int pos[]=new int [nums.length/2];
        int p = 0, n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                pos[p++] = nums[i];
            } else {
                neg[n++] = nums[i];
            }
        }
        for (int i = 0; i < pos.length; i++) {
            ans[i * 2] = pos[i];
            ans[i * 2 + 1] = neg[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={3,1,-2,-5,2,-4};
        int ans[]=rearrange(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}