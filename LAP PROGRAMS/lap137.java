//	Java FileOutputStream class
		import java.io.*;  

public class lap137 {
	  public static void main(String args[]){  
		   try{  
		     FileOutputStream fout=new FileOutputStream("wxy.txt");  
		     String s="I M DINESHKUMAR..M";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close();  
		     System.out.println("successfully create and write ...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  

}
