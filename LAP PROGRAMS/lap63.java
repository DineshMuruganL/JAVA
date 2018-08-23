//Wrapper class Example: Primitive to Wrapper
	
public class lap63 {
		public static void main(String args[]){  
		//Converting int into Integer  
		int a=46;  
	Integer i=Integer.valueOf(a);//converting int into Integer  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  

}
}