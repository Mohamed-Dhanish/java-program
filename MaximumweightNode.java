import java.util.*;
public class MaximumweightNode {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number of nodes cell: ");
       int N = sc.nextInt();

       System.out.println("Enter the n0 of edges array: ");
       int[] edges = new int[N];
       for(int i = 0; i< N; i++){
        edges[i] = sc.nextInt();
       }
       int maxweight = findmaxweightnode(N, edges);
       System.out.println("The node with maximum weight is: " + maxweight);

       sc.close();
    }

    public static int findmaxweightnode(int N, int[] edges) {
        int[] weights = new int[N];
        for(int i = 0; i < N ; i++){
            if(edges[i] != -1) {
                weights[edges[i]] += i;
            }
        }
        int maxweight = 0;
        int maxWeightnode = 0;
        
        for(int i = 0; i < N; i++) {
            if(weights[i] > maxweight) {
                maxweight = weights[i];
                maxWeightnode = i;
            }
        }
        return maxWeightnode;
    }```````````````````````````````````````````````````````````
             
}
