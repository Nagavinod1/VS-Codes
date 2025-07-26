
public class Greatest_among_3 {
    public static void main(String args[]){
        int a =50;
        int b = 20;
        int c =30;

        int high = (a>b)?((a>c)?a:c):(b>c?b:c);
        System.out.println(high);

    }
    
}
