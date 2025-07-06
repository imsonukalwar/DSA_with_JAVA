public class banari_to_decemal {
    public static void main(String[] args) {
            int n=101;
    int lastdig;
    int sum=0;
    while(n>0){
        lastdig=n%10;
        System.out.println(lastdig);//print last digit of number
        sum+=Math.pow(2,lastdig);//store the cube of each digit and sum them.
        n=n/10;

    }
    System.out.println("your decemal num = "+sum);
    }
}
