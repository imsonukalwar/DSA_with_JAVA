
//applicable on sorted array

public class sol {
    public static int[] two_sum(int a[],int target){
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(a[i]+a[j]==target){
                return new int[]{i,j};
            }
            else if(a[i]+a[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 9}; 
        int target = 12;
        int[] ans = two_sum(a, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
