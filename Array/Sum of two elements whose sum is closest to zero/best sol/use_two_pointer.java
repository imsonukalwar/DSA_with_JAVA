import java.util.*;
public class use_two_pointer {
 public static int[] close_to_0(int a[], int target) {
    Arrays.sort(a);
    int i = 0;
    int j = a.length - 1;
    int diff = Integer.MAX_VALUE;
    int[] ans = new int[2];

    while (i < j) {
        int sum = a[i] + a[j];
        int d = Math.abs(target - sum);

        if (d < diff) {
            diff = d;
            // ans[0] = i;
            // ans[1] = j;
            ans = new int[]{i, j};
        }

        if (sum == target) {
            return new int[]{i, j};
        } else if (sum > target) {
            j--;
        } else {
            i++;
        }
    }

    return ans;
}

    public static void main(String args[]){
        int a[]={-8, 5, 2, -6};
        int ans[]=close_to_0(a,0);
        for (int i = 0; i <ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
