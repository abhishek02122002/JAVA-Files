public class throwsandThrowException {
     static int areaMethod(int a,int b) throws Exception{
          if( a<0 || b<0){
               throw new Exception();
          }
          return a*b;
     }
     static void method2() throws Exception{
          System.out.println("Area is"+areaMethod(9, -4));
     }
     public static void main(String []args) throws Exception{
          // method2();
          try{
               method2();
          }
          catch(ArithmeticException exception){
               System.out.println(exception);
          }
     }
     
}
