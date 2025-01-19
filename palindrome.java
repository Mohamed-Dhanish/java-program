import java.util.Scanner;
public class palindrome{
    static boolean palindrome(int num){
        int reverse = 0;
        int original = num;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(original == reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(palindrome(num)){
            System.out.println(num + " is a palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }
    }
}