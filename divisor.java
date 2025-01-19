import java.util.Scanner;
public class divisor {
    public static int[] printdivisor(int n , int[] size){
        int[] divisor = new int[n];
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisor[count++] = i;
            }
        }
        size[0] = count;
        return divisor;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] size = new int[1];
        int[] divisor = printdivisor(n, size);
        System.out.println("Divisors of " + n + " are: ");
        for(int i = 0; i < size[0]; i++){
            System.out.print(divisor[i] + " ");
        }
        System.out.println("");
        divisor = null;

    }


}

