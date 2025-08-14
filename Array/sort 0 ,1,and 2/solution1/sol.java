public class sol {
    public static void sort(int a[]){
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for (int i = 0; i <a.length; i++) {
            if(a[i]==0){
                count_0++;
            }
            if(a[i]==1){
                count_1++;
            }
            if(a[i]==2){
                count_2++;
            }
        }
        for(int i=0;i<count_0;i++){
            a[i]=0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            a[i]=1;
        }
        for(int i=count_0+count_1;i<a.length;i++){
            a[i]=2;
        }
    }
    public static void main (String args[]){
        int a[]={1,0,1,2,1,2,1,0};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
