public class sol{
    public static int lg(int a[],int k){
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum=0;
                for (int l = i; l <=j; l++) {
                    sum+=a[l];
                }
                if(sum==k){
                        count++;
                    }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={2,3,5};
        int ans=lg(a, 5);
        System.out.println(ans);
    }
}
