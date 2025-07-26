public class recursionLength {
    public static int Slength(String str){
        if(str.equals("")){
            return 0;
        }
        return 1+Slength(str.substring(1));
        

        }
    public static void main(String[] args){
        String str="apnanaackvdv";
        System.out.println(Slength(str));
        
    }
}
