import java.util.Scanner;
public class occurences{
    public static int findOccurrences(int[] arr, int target) {
        int count = 0;
        for(int num : arr) {
            if(num == target) {
                count++;
            } else if( num > target) {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "size of array: ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int occurences = findOccurrences(arr, target);
        System.out.println("enter occurences " + occurences);
    }
}