
public class sol {
    public static int[] sol(int a[]){
        int max=0;
        int start=0;
        int end=0;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                sum+=a[j];
                if(sum>max){
                    max=sum;
                    start=i;
                    end=j;
                }
            }
        }
        int ans[]=new int[end-start+1];
        for (int i =0; i <ans.length; i++) {
            ans[i]=a[start+i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans[]=sol(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
