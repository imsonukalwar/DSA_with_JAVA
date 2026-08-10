public class pat_07 {
    public static void patter_07_01(int n){
            int k=0;
        for (int i = 1; i <=n; i++) {
                if(i<=4){
                    k++;
                }else{
                    k--;
                }
            for (int j = 1; j <=n; j++) {
                if(j>=5-k && j<=3+k){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patter_07_01(7);
    }
}
