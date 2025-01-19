//Find the no of count is evenly divides
import java.util.Scanner;

public class countdividebyn {
    static int evenlydivides(int N){
        int cnt = 0;
        int originalN = N;

        while(N>0){
            int digit = N % 10;
            if(digit!=0 && originalN % digit == 0){
                cnt++;
            }
            N /= 10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int N = sc.nextInt();
        int result = evenlydivides(N);
        System.out.println(result);
    }
}
