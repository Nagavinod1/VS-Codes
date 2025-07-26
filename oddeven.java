import java.util.Scanner;

public class oddeven {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int osum=0;
        int oeven=0;
        for(int j=0;j<n;j++){
            if(arr[j]%2==0){
                oeven+=arr[j];

            }
            else{
                osum+=arr[j];
            }
        }
        System.out.println(osum +" "+oeven);
sc.close();
    }
}
