

public class usexor {
    public static int optimal_sol(int a[]){
        int xor=0;
        for (int i = 0; i < a.length; i++) {
            xor^=a[i];
        }
        return  xor;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,4,4,5,5,6,6};
        int ans=optimal_sol(a);
        System.out.println(ans);
    }
}
