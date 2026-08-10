
import java.util.Random;
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userInput;
        int comp_input;
        Random rd=new Random();
        comp_input=rd.nextInt(100);
        for (int i = 0; i < 100; i++) {
        System.out.println("enter user input");
        userInput=sc.nextInt();
        if(comp_input==userInput){
            System.out.println("yes! you guess correct");
            break;
        }
        else if(userInput>comp_input){
            System.out.println("too high");
        }else if(userInput<comp_input){
            System.out.println("too low");
        }else{
            System.out.println("correct");
        }
    }
    }
}