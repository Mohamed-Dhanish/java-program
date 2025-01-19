import java.util.Scanner;
public class naturalsum {
    public static int calculatesum(int n){
        int sum = 0;
        for(int i =1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n = sc.nextInt();
        int result = calculatesum(n);
        System.out.println("Enter the n natural number " + result);
        sc.close();
    }
}
