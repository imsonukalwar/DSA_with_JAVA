public class polonomial_sol {
    public static void main(String[] args) {
             float a=2,b=1,c=4,d,x,y;
        //let rquetion is X^2+8X-4
        //so here   a=1
        //  b=8
        // c=4
    d=(b*b)-4*a*c;
    System.out.println(d);
    if (d<0) {
    System.out.println("roots are immaginary");        

    }
    else if(d==0){
        System.out.println("roots are equal");
    }
    else if (d>0) {
        x=(float)(-b+Math.sqrt(d))/(2*a);
        y=(float)(-b-Math.sqrt(d))/(2*a);
System.out.println("first  "+x);
System.out.println("second  "+y);

        
    }
    }
}
