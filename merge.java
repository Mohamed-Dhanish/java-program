import java.util.Scanner;
public class merge{
    public static String mergealternately(String str1, String str2){
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while(i < str1.length() && j < str2.length()){
            result.append(str1.charAt(i++));
            result.append(str2.charAt(j++));
        }
        while(i < str1.length()){
            result.append(str1.charAt(i++));
        }
        while(j < str2.length()){
            result.append(str2.charAt(j++));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String merge = mergealternately(str1, str2);
        System.out.println("Merged string:" + merge);

    }
}