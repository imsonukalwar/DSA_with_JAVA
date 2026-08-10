public class count {
    public static int count_0(int n){
        int count =0;
        while(n>=5){
            count+=n/5;
            n/=5;
        }
        return count;
    }
    public static void main(String[] args) {
        int ans=count_0(100);
        System.out.println(ans);
        
        
    }
}