//THIS APROACH ALSO USE WITH BRUTE AND BETTER SOLUTION


import java.util.ArrayList;
public class sol {
    public static ArrayList<Integer> findIndex(int a[]) {
        int sum = 0;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum < 0) {   // reset if sum becomes negative
                sum = 0;
                start = i + 1;
            }

            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            li.add(a[i]);
        }

        return li;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        ArrayList<Integer> ans = findIndex(arr);

        System.out.println("Maximum Subarray Elements: " + ans);
    }
}
