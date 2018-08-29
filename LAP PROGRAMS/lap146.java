//CharArrayWriter class:
	import java.io.*;
public class lap146 {
	  
		 public static void main(String args[])throws Exception{  
			 try{
		  
		  CharArrayWriter out=new CharArrayWriter();  
		  out.write("my name is dineshkumar");  
		  
		  FileWriter f1=new FileWriter("a.txt");  
	  FileWriter f2=new FileWriter("b.txt");  
		
		  out.writeTo(f1);  
		  out.writeTo(f2);  
		 
		  
		  f1.close();  
		  f2.close();  
		  
		 }  catch(Exception e){System.out.println(e);}  
		 System.out.println("successfully write");  
		 }

}