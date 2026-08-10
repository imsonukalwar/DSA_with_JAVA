public class print_digit {
    public static void print_dig(int n){
        int dig=0;
        while(n!=0&&n>0){ 
            dig=n%10;
            System.out.println(dig);
            n/=10;
        }
    }
    public static void main(String[] args) {
            print_dig(234512);
    }
}
