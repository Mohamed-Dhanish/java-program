//Find the reverse number
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int reversed = 0;
        while(n!=0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed Num: "+ reversed);
        sc.close();
    }
}
