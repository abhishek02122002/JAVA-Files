class customErrorhandling extends Exception{
      @Override public String toString(){
          return "I am a custom error class String and u have an error ";
     }
     @Override public String getMessage(){
          return "Hello! I am the message";
     }
}
public class customClassThrowandThrows {
     static int areaOfFigure(int a, int b) throws customErrorhandling{
       try{   if(a<0 || b<0){
               throw new customErrorhandling();
          }
          return a*b;
     }
          finally{
               System.out.println("I am areaOfFigure method");
          }
          
     }
     static void method2() throws customErrorhandling{
          areaOfFigure(7, -4);
     }
     public static void main (String ...args){
          try{
               method2();
          }
          catch(customErrorhandling objOfCustomErrorhandlingClass){
               System.out.println(objOfCustomErrorhandlingClass.getMessage());
          }
          finally{
               System.out.println("All error handling concepts are set Buddy ");
          }
     }

}
