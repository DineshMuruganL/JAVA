//Java Runtime Polymorphism with Multilevel Inheritance
public class lap41 {
		void eat(){System.out.println("eating");}  
		}  
		  
		class Dog extends lap41{  
		void eat(){System.out.println("eating meats");}  
		}  
		  
		class BabyDog extends Dog{  
		void eat(){System.out.println("drinking milk");}  
		  

	public static void main(String[] args) {
			lap41 a1,a2,a3;  
			a1=new lap41();  
			a2=new Dog();  
			a3=new BabyDog();  
			  
			a1.eat();  
			a2.eat();  
			a3.eat();  
			}  

	}

