//only sorted array
public class remove {
    public static int[] remov(int a[]) {
        int temp[] = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[i] = a[i];
            }
        }
        temp[a.length - 1] = a[a.length - 1];
        return temp;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8};
        int[] res = remov(a);
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                System.out.print(res[i] + " ");
            }
        }


    }
}




