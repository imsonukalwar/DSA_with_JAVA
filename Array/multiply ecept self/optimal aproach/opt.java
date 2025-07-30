//using kadance algorithm
public class opt{
    public static int[] product_exept_self(int nums[]){
        int n=nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;

    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int ans[] = product_exept_self(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}