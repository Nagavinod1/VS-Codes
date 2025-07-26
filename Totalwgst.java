import java.util.*;

public class Totalwgst{

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter pencil ,pen , eraser amount in inr : ");
        float penc = sc.nextInt();
        float pen = sc.nextInt();
        float eraser =sc.nextInt();
        float total = penc+pen+eraser;
        System.out.println("Total amount without gst :"+total);
        float gst = total*0.18f;
        float total1 = gst+total; 
        System.out.print("Total amount with Gst :"+total1);

        }
    }
