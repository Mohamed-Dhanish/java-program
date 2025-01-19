import java.util.Arrays;
import java.util.Scanner;
public class duplicate {
    static int removeduplicate(int[] arr) {
        int n = arr.length;
        if(n <= 1)
          return n;

    
        int idx = 1;  
        

        for(int i = 1; i<n; i++) {
            if(arr[i] != arr[i - 1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int newsize = removeduplicate(arr);
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < newsize; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

}