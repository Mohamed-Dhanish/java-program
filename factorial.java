public class factorial {
    static int factorial(int n){
        if(n == 0)
            return 1;
        else 
            return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }  
}
