//Find the count of the given number
import java.util.Scanner;
public class count1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int count = 0;
        num = Math.abs(num);
        if(num == 0){
            count = 1;
        }
        else {
            while(num != 0){
                num /= 10;
                count++;
            }
        }
        System.out.println("Count of the number is: " + count);
        sc.close();
    }
}
