

public class max {
public static int max_con_0_and_1(int a[]){
    int count =1;
    int mcount =1;
    for (int i = 1; i < a.length; i++) {
        if(a[i]==a[i-1]){
            count++;
        }else{
            count=1;
        }
        mcount=Math.max(mcount,count);
    }
    return mcount;
}
    public static void main(String[] args) {
        int a[]={1,2,3,4,0,0,0,1,1,0,0,0,0,2,1,1,1,1,1};
        int ans=max_con_0_and_1(a);
        System.out.println(ans);
    }
}

