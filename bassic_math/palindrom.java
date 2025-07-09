import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int n=sc.nextInt();
    int rev=0;;
    int lastdig;
    int original=n;
    while(n>0){
    lastdig=n%10;
    System.out.println(lastdig);
    n=n/10;
    rev=(rev*10)+lastdig;
    }
    System.out.println(rev);
    if(rev==original){
        System.out.println("number is palindrom");
    }
    else{
        System.out.println("not palindrom");
    }
    }
}
