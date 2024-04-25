public class exceptionPropagation {
     static int meth1() {
          return 10 / 0;
     }

     static void method2() {
          // meth1();

          // --------------
          try {
               meth1();
          } catch (ArithmeticException w) {
               System.out.println(w);
          }
     }

     public static void main(String[] args) {
          // try{
          // method2();
          // }
          // catch(ArithmeticException w){
          // System.out.println(w);
          // }

          
          //----------
          method2();
     }
}
