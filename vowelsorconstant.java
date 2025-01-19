import java.util.*;
public class vowelsorconstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().toLowerCase().charAt(0);
        sc.close();
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The character is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is a constant."); 
        } else {
            System.out.println("The character is not a vowel or a constant.");  // for non-alphabetic characters
        }
    }
}
