public class prime_number {
    public static void main(String[] args) {
                int n1=10;
        int n2=25;
       
        for (int i = n1; i < n2; i++) {
            int count=0;
            for (int div = 2; div*div <i;div++) {
                if(i%div==0){
                    count++;
                    break;
                }
            } 
        if(count==0){
            System.out.println(i);
        }
    }
    }
}
