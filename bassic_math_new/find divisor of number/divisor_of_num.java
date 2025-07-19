public class divisor_of_num {
        public static void divi(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        divi(23);
    }
}
