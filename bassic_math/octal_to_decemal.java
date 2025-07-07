public class octal_to_decemal {
    public static void main(String[] args) {
           int n=1266;
        int sum=0;
        int l;
        int i=0;
        while(n>0){
            l=n%10;
            sum+=l*Math.pow(8, i);
            n=n/10;
            i++;
        }
        System.out.println(sum);
    }
}
