public class test{
    public static void main(String args[]){
        
        int first=0,second=1,num=0,end=5;
        System.out.print(first+","+second+",");
        for(int i=0;i<end-2;i++){
            num=first+second;
            first=second;
            second=num;
        System.out.print(num+",");
        }
    }
}