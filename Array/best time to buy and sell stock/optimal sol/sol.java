
public class sol {
    public static int bestTime(int a[]){
        int max=0;
        int i=0;
        int j=1;
        while(i<a.length&&j<a.length){
            if(a[i]>a[j]){
                i=j;
                j=i+1;
            }
            else {
                max=Math.max(max, a[j]-a[i]);
                j++;
            }
        }
        i++;
        return max;
    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int ans=bestTime(a);
        System.out.println(ans);
    }
}
