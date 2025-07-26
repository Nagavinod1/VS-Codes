import java.lang.Math;

public class IterativeHanoi {
    
    // Function to move disks iteratively
    public static void moveDisks(int n, char from_rod, char to_rod, char aux_rod) {
        int total_moves = (int) Math.pow(2, n) - 1;
        char[] rods = {from_rod, aux_rod, to_rod};

        for (int i = 1; i <= total_moves; i++) {
            int from = (i & i - 1) % 3;
            int to = ((i | i - 1) + 1) % 3;
            System.out.println("Move disk from rod " + rods[from] + " to rod " + rods[to]);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        moveDisks(n, 'A', 'C', 'B');
    }
}