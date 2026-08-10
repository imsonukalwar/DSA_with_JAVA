public class rotate_k{
    public static int rotate(int a[],int k){
        int n=a.length;
        k%=n;
        int temp[]=new int[n];
        for (int i = 0; i < k; i++) {
            temp[i]=a[i];
        }
        for (int i = 0; i <n-k ; i++) {
            a[i]=a[i+k];
        }
        for (int i = 0; i < k; i++) {
            a[n-k+i]=temp[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        rotate(a, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}