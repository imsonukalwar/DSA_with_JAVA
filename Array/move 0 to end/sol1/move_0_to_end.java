public class move_0_to_end{
    public static int move(int a[]){
        int n=a.length;
        int j=0;
        int temp[]=new int[n];
        for (int i = 0; i < n; i++) {
            if(a[i]!=0){
                temp[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            a[i]=temp[i];
        }
        for(int i=j;i<n;i++){
            a[i]=0;
        }
        return n;
    }
    public static void main(String[] args) {
        int a[]={1,2,0,0,3,0,4,0,5};
        move(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}