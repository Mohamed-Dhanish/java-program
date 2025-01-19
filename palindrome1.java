import java.util.Scanner;
public class palindrome1 {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0, j = s.length()-1; i < j; i++, j--) {
            if(Character.isUpperCase(s.charAt(i)) != Character.isUpperCase(s.charAt(j))) {
                System.out.println((int) s.charAt(0));
                return;
            }
        }
        System.out.println(s.length());
    
    }
    public static void main(String[] args) {
        solve();
    }
}