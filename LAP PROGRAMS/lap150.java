//PrintStream class:
	import java.io.*;  

public class lap150 {
	 public static void main(String args[])throws Exception{ 
		 try{
	  
	   FileOutputStream fout=new FileOutputStream("mfile.txt");  
	   PrintStream pout=new PrintStream(fout);  
   pout.println(1900);  
	   pout.println("Hi dinesh");  
	   pout.println("Welcome dinesh");  
   pout.close();  
	   fout.close();  
	      
		 }  catch(Exception e){System.out.println(e);}  
		 System.out.println("successfully write");  
	 }

}
