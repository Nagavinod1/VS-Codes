public class ContigiousString {
    public static int Count(String str,int st,int end,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=Count(str,st+1,end,n-1)+Count(str, st, end-1, n-1)-Count(str, st+1, end-1, n-2);
        if(str.charAt(st)==str.charAt(end)){
            res++;
        }
        return res;

    }
    public static void main(String[] args){
        String str="abcba";
        int n=str.length();
        System.out.println(Count(str,0,n-1,n));
    }
}
