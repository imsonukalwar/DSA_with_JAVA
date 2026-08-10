//APPLICABLE ON SORTED ARRAY

import java.util.*;
public class sol2 {
    public static int[] intersection(int a1[],int a2[]){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a1.length&&j<a2.length){
            if(a1[i]==a2[j]){
                list.add(a1[i]);
                i++;
                j++;
            }
            else if(a1[i]>a2[j]){
                j++;
            }
            else {
                i++;
            }
        }
        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a1[]={1,4,4,8,9};
        int a2[]={1,4,6,8,8};
        int[] ans=intersection(a1, a2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
