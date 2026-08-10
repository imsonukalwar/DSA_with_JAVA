public class check {
    public static boolean  check1(int a[]){
        for (int i = 0; i <a.length; i++) {
            if(a[i]<=a[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5,6};
        boolean ans = check1(a);
        System.out.println(ans);
    }
}
