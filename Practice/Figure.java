import java.util.*;
abstract class Figure{
    double dim1,dim2;
    Figure(double a,double b){
       dim1 =a;
       dim2=b;
    }
    abstract double area();

}
class Rectangle extends Figure{
    Rectangle(double l,double b){
        super(l,b);
    }
    double area(){
        return dim1+dim2;
    }
}
class Triangle extends Figure{
    Triangle(double b , double h){
        super(b,h);
    }
    double area(){
        return(dim1*dim2)/2.0;
    }
}
class Methodover{
    public static void main(String args[]){
        double d1,d2;
        Scanner sc =new Scanner(SDystem.in);
        System.out.println("Enter value of 1st Dimension" );
        d1 = sc.nextDouble();
        System.out.println("Enter value of 2nd Dimension");
        d2 = sc.nextDouble();
        Triangle t =new Triangle(d1,d2);
        Figure ref;
        ref=t;
        System.out.println("Area of Rectangle = "+(int)ref.area());
    }
}