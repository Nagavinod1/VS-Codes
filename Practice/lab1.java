import java.util.*;
class lab1{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       int a[] =new int[5],i,j,t;
       System.out.println("Enter unique values between 10 and 100");
       for(j=0;j<5;j++){
        int b=0;
        t=sc.nextInt();
        if(t>=10 && t<=100){
            for(i=0;i<5;i++){
                if(a[i]==t){
                    b++;
                }
            }
            if(b>0){
                System.out.println("Duplicate found retry");
                j--;
                continue;

            }
            else{
                a[j]=t;
            }
        }
        else{
            System.out.println("value must be in 10 and 100");
        }

       }
       System.out.println("The five unique values are ");
       for(i=0;i<5;i++){
        System.out.print(a[i]+" ");
       }


    }

}