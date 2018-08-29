//FileWriter Example	
	import java.io.*;  

public class lap144 {
	public static void main(String args[]){  
	  try{  
	   FileWriter fw=new FileWriter("din.txt");  
	   fw.write("my name is dinesh");  
	   fw.close();  
	  }catch(Exception e){System.out.println(e);}  
	  System.out.println("successfully write");  
	 }  
	}  

