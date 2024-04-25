// public class exception{
//      public static void main(String ...args){
//           try{
//                int a[]={1,2,4,20,0};
//                int result1 = a[0]/a[4];
//                System.out.println(a[12]);
//           }
//           catch(ArithmeticException e){
//                System.out.println("Answer is: "+e);
//           }
//           catch(ArrayIndexOutOfBoundsException p){
//                System.out.println("array index bound:-"+p);
//           }
//      }
// }
public class exception {
     public static void main(String ...args) {
         try {
             int a[] = {1, 2, 4, 20, 0};
             int result1 = a[0] / a[4];
             System.out.println(result1);
             System.out.println(a[12]);
         } catch (ArithmeticException e) {
             System.out.println("ArithmeticException: " + e.getMessage());
             
         } catch (ArrayIndexOutOfBoundsException p) {
             System.out.println("ArrayIndexOutOfBoundsException: " + p.toString());
         }
         finally{
          System.out.println("done");
         }
     }
 }
 