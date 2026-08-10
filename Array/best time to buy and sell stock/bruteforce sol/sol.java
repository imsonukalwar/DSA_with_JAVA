
public class sol {
    public static int bestTime(int a[]){
        int dif=0;
        int max=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length; j++) {
                if(a[i]>a[j]){
                    break;
                }
                else if(a[i]<a[j]){
                    dif=a[j]-a[i];
                    max=Math.max(max, dif);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={7,6,4,3,1};
        int ans=bestTime(a);
        System.out.println(ans);
    }
}
