
public class sol {
    public static int majority(int a[]){
        int count =0;
        int element=0;
        for(int i=1;i<a.length;i++){
            if(count==0){
                count=1;
                element=a[i];
            }
            else if(a[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
            int cunt1=0;
            for (int i = 0; i <a.length; i++) {
                if(a[i]==element){
                    cunt1++;
                }
            }
            if(cunt1>a.length/2){
                return element;
            }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,1};
        int ans=majority(nums);
        System.out.println(ans);
    }
}
