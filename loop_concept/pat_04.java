public class pat_04 {
    public static void patr_04_01(int n){
        for (int i = 0; i <5; i++) {
            //for spase
            for (int j = 1; j <n-i; j++) {
                System.out.print(" ");
            }
            //for star
               for (int j = 1; j <=2*i+1; j++) {
                System.out.print("*");
            }
            //for space
               for (int j = 1; j <n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void patr_04_02(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <2*n; j++) {
                if (j>=n-i&&j<=n+i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //patr_04_01(5);
        patr_04_02(5);
    }
}
