public class most{
    public static int most_water(int a[]){
        
        int max_vol=0;
        for (int i = 0; i < a.length; i++) {
            int vol=0;
            for (int j = i+1; j < a.length; j++) {
                int l=Math.min(a[i],a[j]);
                int b=j-i;
                vol=l*b;
            }
            if(max_vol<vol){
                max_vol=vol;
            }
        }
        return max_vol;
    }
    public static void main(String[] args) {
        int a[]={2,6,3,4,5};
        int ans=most_water(a);
        System.out.println(ans);
    }
}