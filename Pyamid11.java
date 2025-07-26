public class Pyamid11 {
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            // Print spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // Print numbers
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern(4); // No need to print the return value
    }
}