import java.io.File;
import java.io.IOException;
public class file {
  public static void main(String ...args){
     try{

          /* new File("parent-path","child path");
           */
          File obj = new File("abc.txt");
          if(obj.createNewFile()){
               System.out.println("Done");
          }
          // if(obj.canRead()){
          //      System.out.println("yeah!!");
          // }
          else{
               System.out.println("Not done");
          }
          System.out.println("Absolute Path "+obj.getAbsolutePath());
          System.out.println("get Name"+obj.getName());
          System.out.println("File Length"+obj.length());
          System.out.println(obj.exists());
          System.out.println(obj.getParentFile());
          // System.out.println(obj.delete());
         }
         catch(IOException err){
          err.getMessage();
         }
  }
}
