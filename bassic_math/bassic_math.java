    import java.util.*;
public class bassic_math {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    //FIND DIGIT OF A NUMBER
    System.out.println("enter your number");
    int n=sc.nextInt();
    sc.close();
    int lastdig;
    int count=0;
    int sum=0;
    while(n>0)
    {
    lastdig=n%10;
    System.out.println(lastdig);
          //sum of all digit
    sum+=lastdig;
    if (lastdig%2==0) 
    count++;
    n=n/10;
    }
    System.out.println("total even digit in this number"+ count);
        //sum of all digit 
    System.out.println(sum);
    }

}
