//FileReader Example
	import java.io.*;  

public class lap145 {
		 public static void main(String args[])throws Exception{  
		  FileReader fr=new FileReader("din.txt");  
		  int i;  
	  while((i=fr.read())!=-1)  
		  System.out.print((char)i);  
		  
		  fr.close();  
		 }  

}
