import java.util.Scanner;

public class check_answer {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter your number a");
    a=sc.nextInt();
    System.out.println("enter your number b ");
    b=sc.nextInt();
    int sum=a+b;//add a andc b
    int user_ans;
    System.out.println("enter user  input");
    user_ans=sc.nextInt();//enter user input to match with sum if user input is correct than user gusse is right
   
    if(sum==user_ans){
        System.out.println("correct answer");
    }
    else{
        System.out.println("incorrect");
    }
    }
}
