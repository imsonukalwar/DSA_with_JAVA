public class frequency {
    public static void frequency_of_array(int a[]){
                    int feq[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
        if(feq[i]==-1){
            continue;
            }
            int count=0;
            
            for (int j = i; j <a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                    feq[j]=-1;
                }
            }  
            
            System.out.println(a[i]+":"+count);
            
            
        }
    }
    public static void main(String[] args) {
        int a[]={2,6,9,6,4,4,3,2,5,4,3,2,8};
        frequency_of_array(a);
    }
}
