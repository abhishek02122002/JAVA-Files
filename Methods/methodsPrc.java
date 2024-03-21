package Methods;
import java.util.*;

public class methodsPrc {
     static boolean IsNumPrime (int a){
          // int start = 0;
          for( int i =0;i<a;i++){
               if(a%i==0){ return false;}
          }
return true;
     }
     public static void main (String args[]){
          System.out.println(IsNumPrime(3));
     }
}
