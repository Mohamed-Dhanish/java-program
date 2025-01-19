import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        sc.close();

        System.out.println("Prime numbers are:" + n);
        for(int i = 2; i<n; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n < 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}