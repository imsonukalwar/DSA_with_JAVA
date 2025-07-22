public class two_pointer_apro {
    // Two pointer approach

    public static int two_poiner(int a[]) {
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8};
        int newLength = two_poiner(a);

        for (int i = 0; i < newLength; i++) {
            System.out.println(a[i]);
        }
    }
}
