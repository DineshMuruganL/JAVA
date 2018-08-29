//StringTokenizer
	import java.util.StringTokenizer;  
	public class lap92{  
	 public static void main(String args[]){  
	   StringTokenizer st = new StringTokenizer("my name is dinesh");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	   }  
	}  
