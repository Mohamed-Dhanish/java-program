import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
        System.out.println("Before swapping: a = " +a+ " b = " +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " +a+ " b = " +b);
        sc.close();
    }
}
