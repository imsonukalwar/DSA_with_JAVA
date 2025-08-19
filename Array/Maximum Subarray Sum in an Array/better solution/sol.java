public class sol {
    public static int maxsum(int a[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j <a.length; j++) {
                    sum+=a[j];
                    max=Math.max(max, sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        int ans=maxsum(a);
        System.out.println(ans);
    }
}

