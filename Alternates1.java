import java.util.ArrayList;
import java.util.Scanner;
public class Alternates1 {
    public static ArrayList<Integer>  getAlternates(int arr[]) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < arr.length; i+=2){
                res.add(arr[i]);
            }
            return res;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the" + n + "elements:");
            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> res = getAlternates(arr);

            System.out.println("Alternates eleemnt in the array:");
            for(int x : res) {
            System.out.println(x + " ");
        }
        sc.close();
        
    }

    
}
