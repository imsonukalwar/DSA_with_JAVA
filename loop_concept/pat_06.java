public class pat_06{
    public static void patter_06_01(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=2*n; j++) {
                if(j<=n-i||j>n+i){
                    System.out.print("*");
            }else{
                    System.out.print(" "); 
            }
        }
            System.out.println();
    }
}
    public static void main(String[] args) {
        patter_06_01(5);
    }
}