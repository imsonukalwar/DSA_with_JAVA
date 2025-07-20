public class print_fe{
    public static int  print(int n){
        int a=0;
        int b=1;
        int c=0;
        if(n==0&&n==1){
            return n;
        }
        for (int i = 2; i <=n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        int ans=print(5);
        System.out.println(ans);
    }
}