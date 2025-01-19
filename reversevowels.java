import java.util.Scanner;
public class reversevowels {
    public static String reverseVowels(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        while(left < right) {
            if(left < right && vowels.indexOf(chars[left]) == -1){
                left++;
            }
            if(left < right && vowels.indexOf(chars[right]) == -1){
                right--;
            }
            if(left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String result = reverseVowels(s);
        System.out.println(result);

    }
    
}
