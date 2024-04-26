import java.io.*;

public class fileHandlingSecond {
     
     public static void main(String[] args) throws Exception {
          // Writing to file
          FileWriter fw = new FileWriter("def.txt");
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Hi ! I am coding in java \n and I love JAVA");
          bw.close();
          
          // Reading from file
          FileReader fr = new FileReader("def.txt");
          BufferedReader br = new BufferedReader(fr);
          String line;
          
          // Reading and printing each line
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          
          br.close(); // Close the BufferedReader
     }
}
