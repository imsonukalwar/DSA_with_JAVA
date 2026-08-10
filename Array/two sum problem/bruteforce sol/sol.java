public class sol {
    public static int[] two_sum(int a[],int n,int target){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]+a[j]==target){
                    return new int[] { i, j };
                }
            }
        }
        return new int []{};
    }
    public static void main(String[] args) {
        int a[]={1,6,3,8,1,9};
        int n=a.length;
        int [] ans=two_sum(a,n,12);
        for (int i = 0; i <ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
