// super is used to invoke parent class constructor.
 class Bike5 {
		  Bike5(){
			  System.out.println("function is created");}  
		
 }		  
		public class lap34 extends Bike5{  
		  lap34(){  
		   super();//will invoke parent class constructor  
		   System.out.println(" created function is running");  
		  }  
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			  lap34 ob=new lap34();  
			        
			}  

	}


