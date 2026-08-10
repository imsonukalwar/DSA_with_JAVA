
//code applicable on sorted array


public class sol {
    public static int[] two_sum(int a[], int target) {
        int x, y, mid;
        for (int i = 0; i < a.length; i++) {
            x = a[i];
            y = target - x;
            int l = i + 1, r = a.length - 1;
            while (l <= r) {
                mid = (l + r) / 2;
                if (a[mid] == y) {
                    return new int[]{i, mid};
                } else if (a[mid] > y) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
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
