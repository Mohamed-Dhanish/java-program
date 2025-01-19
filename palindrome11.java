import java.util.*;
public class palindrome11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        sc.close();
        if(isPalindrome(s)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}   