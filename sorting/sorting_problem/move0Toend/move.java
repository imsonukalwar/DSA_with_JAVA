
import java.util.Arrays;


//move 0 to end with maintaining relative order

public class move {
    public static void move(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j <a.length-i-1; j++) {
                if(a[j]==0&&a[j+1]!=0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={0,5,0,6,23};
        move(a);
        System.out.println(Arrays.toString(a));
    }
}
