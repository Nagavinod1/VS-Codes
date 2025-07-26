import java.util.*;

public class TravelingSalesperson {
    static final int N = 4; // Number of cities
    static int[][] cost = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
    };

    static int finalRes = Integer.MAX_VALUE; // Stores the final minimum weight of shortest tour
    static int[] finalPath = new int[N + 1]; // Stores the final solution path
    static boolean[] visited = new boolean[N]; // Keeps track of visited cities

    public static void main(String[] args) {
        visited[0] = true; // Start from the first city
        tsp(0, 1, 0, new int[N + 1]); // Start TSP with current city, level, current cost, and path
        System.out.println("Minimum cost: " + finalRes);
        System.out.print("Path Taken: ");
        for (int i = 0; i <= N; i++) {
            System.out.print(finalPath[i] + " ");
        }
    }

    static void tsp(int currPos, int level, int currCost, int[] currPath) {
        // Base case: if all cities are visited and we return to the starting city
        if (level == N && cost[currPos][0] > 0) {
            if (currCost + cost[currPos][0] < finalRes) {
                finalPath[level] = 0; // Store the starting city in the path
                finalRes = currCost + cost[currPos][0]; // Update final result
                System.arraycopy(currPath, 0, finalPath, 0, N); // Copy current path to final path
            }
            return;
        }

        // Visit all cities
        for (int i = 0; i < N; i++) {
            // If the city is not visited and there is a path from current city to city i
            if (!visited[i] && cost[currPos][i] > 0) {
                visited[i] = true; // Mark city as visited
                currPath[level] = i; // Store the city in the current path

                // Recur for the next city
                tsp(i, level + 1, currCost + cost[currPos][i], currPath);

                // Backtrack
                visited[i] = false;
            }
        }
    }
}