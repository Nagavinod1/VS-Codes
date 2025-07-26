public class Example{
    public static void main(String args[]){
        edu p1 =new edu();
        System.out.println( p1.sal);
        System.out.println(p1.saal);
        System.out.println(p1.su);
        Employee p2 =new Employee();
        System.out.println(p2.sal);




    }
}
class Employee{
    float sal =40000f;

}
class Student extends Employee{
   int saal =100;
}
class edu extends Student{
    int su =44;
}