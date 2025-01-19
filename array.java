import java.util.Scanner;
public class array{
    public static boolean isvalueinarray(int[] arr, int target){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]== target){
                return true;
            }
        }
        return false;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the array elements:");
        for(int i =0; i< size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
       if(isvalueinarray(num, target)){
        System.out.println("The target value is present in the array");
       }
       else{
        System.out.println("The target value is not present in the array");
       }
       sc.close();

    }
    
}