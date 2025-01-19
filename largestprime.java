import java.util.Scanner;
public class largestprime{
    public static long Largestprime(long n) {
        long largestfactor = -1;
        while(n % 2 == 0) {
            largestfactor = 2;
            n /= 2;
        }
        for(long i = 3; i * i <= n; i += 2) {
            while(n % i == 0) {
                largestfactor = i;
                n /= i;

            }
        }
        if(n > 2){
            largestfactor = n;
        }
        return largestfactor;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println("Largest prime factor of " + n + " is: " + Largestprime(n));
        long result = Largestprime(n);
        System.out.println("The result is: " + result);
        sc.close();
    }
}