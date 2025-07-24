public class rotate {
    public static void left_rotate(int a[]) {
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};

        left_rotate(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
