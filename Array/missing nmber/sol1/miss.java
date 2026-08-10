public class miss{
    public static int missing(int a[]){
        int miss=a.length;
        for (int i = 0; i < a.length; i++) {
            miss=i^a[i]^miss;
        }
        return miss;
    }
    public static void main(String[] args) {
        int a[]={1,5,7,6,4,2,0};
            int ans=missing(a);
            System.out.println(ans);
    }
}