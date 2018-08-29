//Regex Quantifiers
	import java.util.regex.*;  
	class lap95{  
	public static void main(String args[]){  
	System.out.println(Pattern.matches("[amn]", "ask"));//false (not a or m or n)  
	System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
	System.out.println(Pattern.matches("[amn]", "ammm"));//false (m and a comes more than once)  
	}}  
