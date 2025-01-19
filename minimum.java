import java.util.Scanner;
public class minimum {
    public static int minelement(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the elememt: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the " + n + " element: ");
        for( int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int minimum = minelement(arr);
        System.out.println("Minimum value int the array: " + minimum);

    }
}