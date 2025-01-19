import java.util.*;
public class Nearestmeetingcell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cell: ");
        int n = sc.nextInt();
        System.out.println("Enter the edges: ");
        int[] edges = new int[n];
        for(int i = 0; i < n; i++) {
            edges[i] = sc.nextInt();
        }
        System.out.println("Enter the two cells: ");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        if(c1 < 0 || c1 >=n || c2 < 0 || c2 >=n) {
            System.out.println("Invalid cell");
        } else {
            int result = findNearestmeetingcell(edges, c1, c2);
            System.out.println("The nearest meeting cell is: " + result);

        }
        sc.close();

    }
    public static int findNearestmeetingcell(int[] edges, int c1, int c2) {
        int n = edges.length;
        int[] distFromC1 = calculateDistance(edges, c1);
        int[] distFromC2 = calculateDistance(edges, c2);
        

        int minDistance = Integer.MAX_VALUE;
        int nearestCell = -1;

        for(int i = 0; i< n; i++){
            if(distFromC1[i] != -1 && distFromC2[i] != -1) {
                int maxdistance = Math.max(distFromC1[i], distFromC2[i]);

                if(maxdistance  < minDistance || (maxdistance == minDistance && i < nearestCell)) {
                    minDistance = maxdistance;
                    nearestCell = i;
                }
            }
        }
        return nearestCell;

    }
    private static int[] calculateDistance(int[] edges, int start) {
        int n = edges.length;
        int[] distances = new int[n];
        Arrays.fill(distances,-1);
        int distance = 0;
        int current = start;
        while(current != -1 && distances[current] == -1 ){
            distances[current] = distance;
            distance++;
            current = edges[current];
        }

        return distances;
        
    }
    
}
