
public class sol {
    public static int maxsum(int a[]){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <a.length; j++) {
                int sum=0;
                for (int k = i; k <=j; k++) {
                    sum+=a[k];
                    max=Math.max(max, sum);
                }
            }
        }
        return max;
    }