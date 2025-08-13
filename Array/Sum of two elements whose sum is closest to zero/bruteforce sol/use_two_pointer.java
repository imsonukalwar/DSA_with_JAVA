import java.util.*;

public class use_two_pointer {
    public static int[] close_to_0_bruteforce(int a[], int target) {
        int diff = Integer.MAX_VALUE;
        int[] ans = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                int d = Math.abs(target - sum);

                if (d < diff) {
                    diff = d;
                    ans[0] = a[i];
                    ans[1] = a[j];
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int a[] = {10, 20, 30, 5};
        int ans[] = close_to_0_bruteforce(a, 25);
        for (int x : ans) {
            System.out.println(x);
        }
    }
}
