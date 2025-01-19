//find largest of two numbers using Ternary and if-else operator
import java.util.Scanner;
public class largest2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        int largest;
        if(a>b&&a>c){
           largest = a;
        }
        else if(b>a&&b>c){
           largest = b;        
        }
        else{
           largest = c;
        }
        System.out.println("The largest no is " + largest);
        sc.close();
       
    }
}
