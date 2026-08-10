public class pat_01{
    public static void pattern01(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_02(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
      public static void pattern_03(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //pattern01(5);
       // pattern_02(5);
       pattern_03(5);
    }
}