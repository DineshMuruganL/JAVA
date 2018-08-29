//Regex Metacharacter
	import java.util.regex.*;  
	class lap97{  
	public static void main(String args[]){  
	System.out.println("metacharacters d....");//d means digit  
	System.out.println(Pattern.matches("\\d", "abc"));//false   
	System.out.println(Pattern.matches("\\d", "1"));//true   
System.out.println(Pattern.matches("\\d", "4443"));//false   
	System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
	  
	System.out.println("metacharacters D....");//D means non-digit  
	  
	System.out.println(Pattern.matches("\\D", "abc"));//false  
	System.out.println(Pattern.matches("\\D", "1"));//false   
	System.out.println(Pattern.matches("\\D", "4443"));//false  
	System.out.println(Pattern.matches("\\D", "323abc"));//false   
System.out.println(Pattern.matches("\\D", "m"));//true   
	  
	System.out.println("metacharacters D with quantifier....");  
System.out.println(Pattern.matches("\\D*", "mak"));//true  
	  
	}}  
