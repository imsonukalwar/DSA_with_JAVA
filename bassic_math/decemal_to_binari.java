public class decemal_to_binari {
public static void main(String[] args) {
        int n=5;
    int rem[]=new int[n];
    int i=0;
    while(n>0){
     rem[i]=n%2;
     n/=2;
     i++;}
for(int j=i-1;j>=0;j--){
    System.out.println(rem[j]);
}
}

}