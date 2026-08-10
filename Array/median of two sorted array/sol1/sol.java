public class sol{
    public static String meadian(int a[],int b[]){
        int sum=0;
        int i=0;
        int j=0;
        int ans[]=new int[a.length+b.length];
        int k=0;
        while(i<a.length&&j<b.length){
            if (a[i] < b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }
        while (i < a.length) {
            ans[k++] = a[i++];
        }
        while (j < b.length) {
            ans[k++] = b[j++];
        }
        float meadian;
        int n = ans.length;
        if (n % 2 == 1) {
            meadian = ans[n / 2];
        } else {
            meadian = (ans[(n / 2) - 1] + ans[n / 2]) / 2.0f;
        }
        return String.format("%.5f", meadian);
    }
    public static void main(String[] args) {
        int a[]={1,2};
        int b[]={2,4};
        String ans=meadian(a, b);
        System.out.println(ans);
    }
}