import java.util.Scanner;
public class largest {
    public static int findlargestelement(int[] arr){
        int largest = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int largest = findlargestelement(arr);
        System.out.println("The largest element is: " + largest);

        sc.close();
    }

}
