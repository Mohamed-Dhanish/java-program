import java.util.Scanner;
public class Neon{
    public static boolean neon(int n) {
        int square = n * n;
        int sum = 0;
        while(square > 0){
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(neon(n)){
            System.out.println(n + " is a neon number");
        }
        else {
            System.out.println(n + " is not a neon number");
        }
        sc.close();
    }
}