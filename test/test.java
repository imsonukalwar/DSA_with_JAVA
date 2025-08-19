
public class test{
    public static int[] findIndex(int a[]) {
        int sum = 0;
        int s = 0;
        int e = 0;
        int temps=0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
        sum += a[i];
        if(sum>max){
            max=sum;
            s=temps;
            e=i;
            }
            if(sum<0){
                sum=0;
                temps=i+1;
            }
        }
        int ans[]=new int[e-s+1];
        for (int i =0; i <ans.length; i++) {
            ans[i]=a[s+i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans[] = findIndex(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}