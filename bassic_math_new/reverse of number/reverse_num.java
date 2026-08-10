public class reverse_num {
    public static int rev(int n){
        int rev=0;
            while(n!=0&&n>0){ 
                int dig=n%10;
                n/=10;
                rev=(rev*10)+dig;
            }
        return rev;
    }
    public static void main(String[] args) {
        int ans=rev(123456);
        System.out.println(ans);
    }
}
