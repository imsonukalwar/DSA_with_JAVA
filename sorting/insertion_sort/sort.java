
import java.util.Arrays;


public class sort {
    public static void sort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int j=i;
            while (j>0 &&a[j]<a[j-1]) { 
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={5,3,7,1,8,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
