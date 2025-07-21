public class print {
    public static void print1(int a[]){
        for (int i = 0; i < a.length; i+=2) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,5,6,7,8,9};
        print1(a);
    }
}
