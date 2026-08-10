public class pat_02 {
    public static void pattern_02(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=(n+1)-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_02_01(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=(n+1)-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern_02(5);
        pattern_02_01(5);
    }
}
