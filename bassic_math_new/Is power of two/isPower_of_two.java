public class isPower_of_two {
      public static boolean isPowerOfTwo(int n) {
        if(n<1)
        return false;
        while(n!=1){
            if(n%2==1)
            return false;
            n/=2;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans=isPowerOfTwo(64);
        System.out.println(ans);
    }
}
