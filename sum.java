
import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        num2 = sc.nextInt();
        System.out.println("The sum of two numbers is : " + (num1+num2));
; 
    }
}