//super can be used to invoke parent class method
 class Person{
		void message(){System.out.println("i m base class");}  
		}  
		  
  public class lap35 extends Person{  
		void message(){System.out.println("i m derived class");}  
		  
		void display(){  
		message();//will invoke current class message() method  
		super.message();//will invoke parent class message() method  
		}  
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
			lap35 s=new lap35();  
			s.display();  
			}  

	}


