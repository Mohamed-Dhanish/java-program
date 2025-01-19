import java.util.Scanner; 
public class primepalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime:");
        int num = sc.nextInt();
        sc.close();
        int start = 1;
        int end = 100000000;
        for(int i = start; i<=end; i++){
            if(isPrime(i) && isPalindrome(i)){
                System.out.println(i +" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while(num!=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

}