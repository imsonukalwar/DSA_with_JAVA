public class oproach2{
        public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int sum1=0;
        for(int i=0;i<n;i++){
        sum1+=nums[i];
        } 
        int ans=sum-sum1;
        return ans;
    }
    public static void main(String args[]){
        int a[]={1,5,7,6,4,2,0};
            int ans=missingNumber(a);
            System.out.println(ans);
    }
}