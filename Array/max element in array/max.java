public class max {
    public static int print_max(int a[]){
        int max=a[0];
        for (int i = 0; i <a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={2,6,4,8,4,0,7};
        int ans=print_max(a);
        System.out.println(ans);
    }
}
