import java.util.Scanner;
public class program1 {
    public static void printNos(int N) {
        if(N==0){
            return;
        }
        printNos(N-1);
        System.out.print(N + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        printNos(N);
        sc.close();
    }
    
}
