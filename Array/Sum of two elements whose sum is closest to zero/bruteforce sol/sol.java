

public class sol {
    public static int pair_close_to_0(int a[]){
        int res=a[0]+a[1];
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int cur=a[i]+a[j];
                if(cur==0){
                    return 0;
                }
                if(Math.abs(cur)<Math.abs(res)){
                    res=cur;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,-2,3,4,5,-1,6,-7};
        int ans=pair_close_to_0(a);
        System.out .println(ans);
    }
}
