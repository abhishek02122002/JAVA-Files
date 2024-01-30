import java.lang.*;
class stringPractice{
public static void main(String ...args)
{
	 // 4 Ways to create a string in java 
	  String s1 = "Java";

	  char c[] ={'m','e','s','s','i'};
	  String s2 = new String(c);

	  byte b[]={67,68,69,70};
	  String s3 = new String(b);

	  String s4 = new String("Python");
	  System.out.println(s1+" " +s2+" "+s3+" "+ s4);
	  
	  // Important String Functions
	  //1 - s.length();
	  //2 - s.charAt(index);
	 //3 - s.toLowerCase() ;
	  //4 - s.toUpperCase()
	  //5 - s.trim();
	  //6. - s.substring(start,end);
	  // 7. - s.replace(old,new)
	  // 8. - s.concate(s2);
	  //9. - s.equals(s2);
	  //10. - s.equasIgnoreCase(s2);
	  //11. - s.endsWith(s2);
	  //12. - s.startsWith(s2);
	  //13. - s.indexOf(s2);
	  //14. - s.compareIndex(s2);
	  //15. - s.valueOf(s2);
	  //16. - s.split(s2);

	  
	  int l1 = s1.length();
	  int l2 = s2.length();
	  int l3 = s3.length();
	  int l4 = s4.length();
	  System.out.println(l1+" "+l2+" "+l3+" "+l4);

	  char c1 = s1.charAt(2);
	  char c2 = s2.charAt(2);
	  char c3 = s3.charAt(2);
	  char c4 = s4.charAt(2);
	  System.out.println(c1+" "+c2+" "+c3+" "+c4);

	  String s5 = s1.toLowerCase();
	  String s6 = s2.toLowerCase();
	  String s7 = s3.toLowerCase();
	  String s8 = s4.toLowerCase();
	  char c0= s4.charAt(2);
	  System.out.println(s5+" "+s6+" "+s7+" "+s8 +" "+ c0);

	 	String s9 = s1.toUpperCase();
		String s10 = s2.toUpperCase();
		String s11 = s3.toUpperCase();
		String s12 = s4.toUpperCase();
	  	char c88 = s4.charAt(2); 
		System.out.println(s9+" "+s10+" "+s11+" "+s12+" "+c88);

	 String s13 = s1.substring(0,3);
	  String s14 = s2.substring(0,3);
	  String s15 = s3.substring(0,3);
	  String s16 = s4.substring(0,3);
	  System.out.println(s13+" "+s14+" "+s15+" "+s16);

	  String s17 = s1.replace('A','u');
	  String s18 = s2.replace('e','q');
	  String s19 = s3.replace('C','t');
	  String s20 = s4.replace('I','o');
	   char c100= s4.charAt(2);
	  System.out.println(s17+" "+s18+" "+s19+" "+s20+" "+ c100);

	  String s21 = s1.concat(s2);
	  String s22 = s3.concat(s4);
	  System.out.println(s21+" "+s22);

	  boolean right = s1.equals(s2);
	  System.out.println(right);

	  int index = s1.indexOf('a');
	  int index2 = s2.indexOf('e');
	  int index3 = s3.indexOf('E');
	  int index4 = s4.indexOf('h');
	  System.out.println(index+ " "+ index2+" " + index3 +" "+ index4 );

	
}
}