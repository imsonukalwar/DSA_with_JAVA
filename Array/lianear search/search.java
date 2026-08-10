public class search{
    public static int  liniar_search(int a[],int item){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==item){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int a[]={2,5,3,7,9,55};
        int ans=liniar_search(a,33);
        System.out.println(ans);
    }
}