public class sol2 {
    public static void sort(int a[]){
        int l=0;
        int m=0;
        int h=a.length-1;
        while(m<=h){
            if(a[m]==0){
                int temp=a[m];
                a[m]=a[l];
                a[l]=temp;
                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int temp=a[m];
                a[m]=a[h];
                a[h]=temp;
                h--;
            }
        }
    }
    public static void main (String args[]){
        int a[]={0,2,1,2,0};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
