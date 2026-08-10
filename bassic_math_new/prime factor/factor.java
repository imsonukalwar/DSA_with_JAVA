public class factor {
    public static void prime(int n){
       for (int i =2; i <=n; i++) {
            while(n%i==0){
                n/=i;
                System.out.println(i);
            }
        }
        // if(n>2){
        //     System.out.println(n);
        // }
    }
    public static void main(String[] args) {
        prime(97);
    }
}
