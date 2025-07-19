public class pat_03 {
    public static void patter_03_01(int n){
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j>=(n+1)-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void patter_03_02(int n){
            for (int i =1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       patter_03_01(5);
       patter_03_02(5);
    }
    
}
