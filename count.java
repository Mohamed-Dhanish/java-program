import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int count;
        System.out.println("Enter the count:");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int number, sum = 0;
        for(int i =0;i<count;i++){
            number =sc.nextInt();
            sum += number;
        }
        System.out.println("Sum of all these number :" +sum);
    }
}
