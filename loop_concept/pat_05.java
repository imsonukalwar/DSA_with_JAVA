public class pat_05 {
    public static void patr_05_01(int n){
               for (int i =0; i <n; i++) {
                boolean k=true;
            for (int j = 1; j <=2*n; j++) {
                if (j>=n-i&&j<=n+i&&k) {
                    System.out.print("*");
                    k=false;
                }else{
                    System.out.print(" ");
                    k=true;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patr_05_01(5);
    }
}
