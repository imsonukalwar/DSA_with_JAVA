// here we are using kadane's algorithm
public class sol {
    public static int maxsubarray_sum(int a[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <a.length; i++) {
            sum+=a[i];
            max=Math.max(sum, max);
            if(sum<0){
                sum=0;
            }
        }
        if(max<0){
                max=0;
            }
        return max;
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        int ans=maxsubarray_sum(a);
        System.out.println(ans);
    }
}
