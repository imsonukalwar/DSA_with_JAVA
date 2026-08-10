public class sec_max {
    public static int se_max(int a[]){
        int max1=print_max(a);
        int sec_max=-1;
        for (int i = 0; i <a.length; i++) {
        if(a[i]>sec_max&&a[i]!=max1){
                sec_max=a[i];
            }
        }
        return sec_max;
    }
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
        int a[]={2,4,6,8,5,1,4,9,9,};
        int ans=se_max(a);
        System.out.println(ans);
    }
}
