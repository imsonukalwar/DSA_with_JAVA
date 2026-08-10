
public class sol {
    public static int majority(int a[]){
        int max_count=0;
        int ans=0;
        for (int i = 0; i <a.length; i++) {
            int count =0;
            for (int j = i+1; j <a.length; j++) {
                if(a[i]==a[j]){
                    count+=1;
                }
            }
            max_count=Math.max(max_count, count);
            ans=a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,4,2,4,3,4,4,3,2,4,2,7,2,8,2};
        int ans=majority(nums);
        System.out.println(ans);
    }
}
