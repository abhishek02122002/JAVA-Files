import java.io.*;
public class filehandling{
public static void main(String[] args)throws Exception {
     System.out.println("File handling");
     File file = new File("abc.txt");
     file.createNewFile();  // this throws exception , so we need exception class
     System.out.println(file.exists()); // prints True as i have written the above code.
     

     // Now how to read and write in file ? because , neither read nor write is available in file.
     System.out.println(file.canExecute()); // return boolean as can we update , read and write in file?
     //-> to do this we need object of file reader and file writer in java
     FileWriter fw = new FileWriter(file);
     fw.write("hello ! I am Abhishek Singh");
     fw.close();
     FileReader fr = new FileReader(file); // argument me ya to file object pass karo nahi to file oject ka right side ka pura line pass karo.
     System.out.println(fr.read()); // this return -1 if it pointer reaches to end of the character.

     // Now the problem is that , we can not solve this query by simple file handling , to do this we need 
     // a buffer pool , which is a barrier pool in between.

}
}