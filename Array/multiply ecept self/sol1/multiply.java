//multiply exept self
public class multiply{
    static int[] mul(int a[]){
        int k=0;
        int temp[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int mul=1;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    mul *= a[j];
                }
            }
            temp[k++]=mul;
        }
        return temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int ans[]=mul(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}