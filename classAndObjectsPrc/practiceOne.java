import java.util.*;
// class example 
class circle {
     public double radius;
     public double area(){
          return Math.PI*Math.pow(radius,2);
     }
     public double circumference(){
          return Math.PI*2*radius;
     }

}

public class practiceOne {
     public static void main (String ...args) {
          Formatter fm=new Formatter();
          circle one = new circle();
          one.radius=2.56;
          fm.format("%.4f", one.area());
          System.out.println(fm);
          fm.close();
         
          // System.out.println(String.format("%.3",one.area())); <----- what is the mistake.
     }
}