class Student{
     public String name;
     public int marks_of_Physics;
     public int marks_of_Mathematics;
     public int marks_of_chemistry;
     private int rollNumber;
     private int fees;
     public void setRollNumber(int rollNumber){
          if(rollNumber>0){
               this.rollNumber=rollNumber;
          }
          else{
               this.rollNumber=Integer.parseInt(null);
          }
     }
     public void writingMethod(int a){
          if(a>0){
               this.fees=a;
          }
          else{
               this.fees=2345;
          }
     }
     public int writingFunction(){
          return fees;
     }
     public void phyMet(int marks_of_Physics){
          System.out.println("Physics marks is"+marks_of_Physics);
          int percentage = ((marks_of_Physics)*100)/100;
          System.out.println("Percentage is "+percentage);
     }
     public void metMet(int marks_of_Mathematics){
          System.out.println("Physics marks is"+marks_of_Mathematics);
          int percentage = ((marks_of_Mathematics)*100)/100;
          System.out.println("Percentage is "+percentage);
     }
     public void cheMet(int marks_of_chemistry){
          System.out.println("Physics marks is"+marks_of_chemistry);
          int percentage = ((marks_of_chemistry)*100)/100;
          System.out.println("Percentage is "+percentage);
     }
     public int totalmarks(){
          int total = marks_of_Mathematics+marks_of_Physics+marks_of_chemistry;

          int TotalPercentage = (total*100)/300;
          // System.out.println(TotalPercentage);
          return TotalPercentage;
     }
     
     public String toString(){
          int percentage = totalmarks();
          return "Name: "+name+"\n"+ "Roll Number: "+rollNumber+"\n" +"Marks_of_Physics: "+marks_of_Physics+"\n"+"Marks_of_chemistry: "+marks_of_chemistry+"\n"+"Marks_of_Mathematics: "+marks_of_Mathematics+"\n"+"Total marks: "+percentage+"%";
     }

}
public class classPrcTwo{
     public static void main (String ...args){
          Student one = new Student();
          one.name="Abhishek Singh";
          one.setRollNumber(27);
          one.marks_of_Physics=80;
          one.marks_of_Mathematics=95;
          one.marks_of_chemistry=89;
          // one.totalmarks();
          System.out.println(one);

     }
}