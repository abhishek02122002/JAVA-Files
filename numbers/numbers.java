import java.util.*;
public class numbers{
     public static void main (String ...args){
          System.out.println("ARMSTRONG NUMBERS");
          System.out.println();
          Scanner s = new Scanner(System.in);
          System.out.print("Enter a number :-");
          int num = s.nextInt();
          int digitsCount =0;
          int org = num;
          while(num!=0){
          
               num=num/10;
               digitsCount++;
          }
          num =org;
          int sum =0;
          int remainder=0;
          while(org!=0){
               remainder=org%10;
               sum +=Math.pow(remainder,digitsCount);
               // sum+=Math.pow(num%10,digitsCount);
               org/=10;
          }
          if(num == sum){
               System.out.println("yes");
          }
          else{
               System.out.println("no");
          }
          s.close();
     }
}