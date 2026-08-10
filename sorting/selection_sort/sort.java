import java.util.Arrays;

public class sort {
    public static void sort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int smallestIndex=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[smallestIndex]>a[j]){
                    smallestIndex=j;
                }
            }
            int temp=a[smallestIndex];
            a[smallestIndex]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String[] args) {
        int a[]={3,6,9,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
