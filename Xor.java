//Find if a number is even or odd using bitwise operator
public class Xor {
    public static void main(String[] args) {
        int n = 23;
        if((n ^ 1) == n + 1){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
