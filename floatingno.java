import java.util.Scanner;

public class floatingno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b:");
        float b = sc.nextFloat();
        float c = a*b;
        System.out.println("The product of two numbers is: " +c);
        sc.close();
    }
}