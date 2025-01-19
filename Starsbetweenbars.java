import java.util.Scanner;
public class Starsbetweenbars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string contain '|' and '*' : ");
        String s = sc.nextLine();
        System.out.println("Enter the no of queries:");
        int n = sc.nextInt();
        int[] startindex = new int[n];
        int[] endindex = new int[n];
        System.out.println("Enter the start and end indices for each query:");
        for(int i = 0; i< n;i++) {
            System.out.print("query" + (i+1) + " -start index :");
            startindex[i] = sc.nextInt();
            System.out.print("query" + (i+1) + " - end index :");
            endindex[i] = sc.nextInt();
        }
        for(int i = 0; i< n; i++) {
            int start = startindex[i];
            int end = endindex[i];
            int Starcount = countstarinrange(s,start,end);
            System.out.println("query " + (i+1) + " is: " + Starcount);
        }
        sc.close();
    }
    public static int countstarinrange(String s, int start, int end) {
        String substr = s.substring(start, end + 1);
        int firstbar = substr.indexOf('|');
        int lastbar = substr.lastIndexOf('|');
        if(firstbar == -1 || lastbar == -1 || firstbar == lastbar) {
            return 0;
        }
        int Starcount = 0;
        for(int i = firstbar + 1; i < lastbar; i++) {
            if(substr.charAt(i) == '*') {
                Starcount++;
            }
        }
        return Starcount;

    }
}