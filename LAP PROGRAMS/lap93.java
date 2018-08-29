//Java Regular Expressions
	import java.util.regex.*;  
	public class lap93{  
	public static void main(String args[]){  
	//1st way  
	Pattern p = Pattern.compile(".s");//. represents single character  
	Matcher m = p.matcher("dk");  
	boolean b = m.matches();  
	  
	//2nd way  
	boolean b2=Pattern.compile(".s").matcher("ds").matches();  
	  
	//3rd way  
	boolean b3 = Pattern.matches(".s", "kk");  
	  
	System.out.println(b+" "+b2+" "+b3);  
	}}  
