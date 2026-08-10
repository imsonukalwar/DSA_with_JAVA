public class leadear {
    public static void lead(int a[]) {
        int lead1 = a[a.length - 1];
        System.out.println(lead1);

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > lead1) {
                lead1 = a[i];
                System.out.println(lead1);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 15, 6, 17, 8, 1};
        lead(a);
    }
}
