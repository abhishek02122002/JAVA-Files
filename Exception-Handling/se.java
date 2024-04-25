public class se {
     public static void main(String[] args) {
         try {
             int a[] = {10, 20, 30, 40, 50, 60, -1, 0};
             try {
                 int result = a[0] / a[7];
                 System.out.println(result);
             } catch (ArithmeticException w) {
                 System.out.println(w.getMessage());
             }
             try {
                 int element = a[13];
                 System.out.println(element);
             } catch (ArrayIndexOutOfBoundsException arrBound) {
                 System.out.println(arrBound.getMessage());
             }
         } catch (Exception ex) {
             System.out.println("Outer Exception occurred: " + ex.getMessage());
         } finally {
             System.out.println("Exceptions are checked");
         }
     }
 }
 