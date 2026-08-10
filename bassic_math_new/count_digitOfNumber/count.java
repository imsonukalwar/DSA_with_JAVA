public class count{
    public static int count_dig(int n){
        int count=0;
        while(n!=0&&n>0){
            int dig=n%10;
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int result=count_dig(239054804);
        System.out.println(result);
    }
}