public class two_pointer_aproach {
    public static int move_0_to_end(int a[]) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
        //     if (a[i] == 0 && a[j] != 0) {
        //         // swap only if a[i] is 0 and a[j] is non-zero
        //         int temp = a[i];
        //         a[i] = a[j];
        //         a[j] = temp;
        //         i++;
        //         j--;
        //         } else if (a[i] != 0) {
        //          // if a[i] is not 0, move forward
        //         i++;
        //         } else if (a[j] == 0) {
        //          // if a[j] is 0, move backward
        //         j--;
        //         }
        // }
        if(a[i]!=0){
            i++;
        }
        else if(a[j]!=0){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        else{
            j--;
        }
    }

        return 1;
    }

    public static void main(String[] args) {
        int a[] = {0,1,2,3,0,0,1,2};
        move_0_to_end(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
