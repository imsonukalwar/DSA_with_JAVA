public class print_armstrong {
    public static boolean print_arm(int n){
        int dig;
        int arm=0;
        int num=n;
        while (n!=0&&n>0) { 
            dig=n%10;
            arm+=(dig*dig*dig);
            n/=10;
        }
        if(num==arm){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        boolean ans=print_arm(100);
        System.out.println(ans);
    }
}
