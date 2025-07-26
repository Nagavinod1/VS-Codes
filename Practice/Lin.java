import java.util.*;;
public class Lin {
    public static int Linser(int num[],int find){
        for(int i=0;i<num.length;i++){
            if(num[i]==find)
                return i;
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();   
        }
        System.out.println("Enter num to find");
        int find=sc.nextInt();
        System.out.println(Linser(num,find));

    }
}
