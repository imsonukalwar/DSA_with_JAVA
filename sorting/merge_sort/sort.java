
import java.lang.reflect.Array;
import java.util.*;

public class sort{
    static void merge_sort(int a[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        merge_sort(a,start,mid);
        merge_sort(a,mid+1,end);
        sorting(a,start,mid,end);
    }
    static void sorting(int a[],int start,int mid,int end){
        ArrayList<Integer> list = new ArrayList<>();
        mid=start+(end-start)/2;
        int left=start;
        int right=mid+1;
        while(left<=mid && right<=end){
            if(a[left]<a[right]){
                list.add(a[left]);
                left++;
            }else{
                list.add(a[right]);
                right++;
            }
        }
        while(left <= mid){
                list.add(a[left]);
                left++;
            }
            while(right <= end){
                list.add(a[right]);
                right++;
            }
        for (int i = 0; i < list.size(); i++) {
            a[start+i]=list.get(i);
        }
    }
    public static void main(String args[]){
        int a[]={2,4,5,7,5,34,1,1,3,4,6,6,656,4};
        int start=0;
        int end=a.length-1;
        merge_sort(a, start, end);
        System.out.println(Arrays.toString(a));
    }
}