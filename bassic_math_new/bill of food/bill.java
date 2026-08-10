import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of pizza (S/M/L):");
        char size = sc.next().charAt(0);
        int bill = 0;
        if (size == 's' || size == 'S') {
            bill += 100;
        } else if (size == 'm' || size == 'M') {
            bill += 200;
        } else if (size == 'l' || size == 'L') {
            bill += 300;
        }
        System.out.println("Do you want peperoni? (Y/N) = add price 30 or 50:");
        char add_pepperoni = sc.next().charAt(0);
        if (add_pepperoni == 'Y' || add_pepperoni == 'y') {
            if (size == 's' || size == 'S') {
                bill += 30;
            } else {
                bill += 50;
            }
        }
        System.out.println("Do you want extra cheese? (Y/N) = add price 20:");
        char add_cheese = sc.next().charAt(0);
        if (add_cheese == 'Y' || add_cheese == 'y') {
            bill += 20;
        }
        System.out.println("Your final bill is: " + bill);
        sc.close(); 
    }
}
