public class rev {
    public static int reverse(int n){
        int rev=0;
        int ori_pos=1;
        while (n!=0) {
            int dig=n%10;
            int pos=dig;
            int id=ori_pos;
            rev=rev+id*(int)Math.pow(10, pos-1);
            n/=10;
            ori_pos++;
        }
        return rev;
    }
    public static void main(String[] args) {
        int ans=reverse(35412);
        System.out.println(ans);
    }
}
