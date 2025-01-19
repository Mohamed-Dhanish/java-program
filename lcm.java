import java.util.Scanner;
public class lcm{
    public static int findLCM(int a, int b){
        int lcm = (a > b) ? a : b;
        while(lcm % a != 0 || lcm % b != 0){
            lcm += (a > b) ? a : b;
        }
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int lcm = findLCM(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
    }
}