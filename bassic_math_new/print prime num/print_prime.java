public class print_prime {
    public static void print(int n,int m){
        for (int i = n; i <=m; i++) {
            int count=0;
            for (int j = 1; j<=i ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        print(10, 23);
    }
}
