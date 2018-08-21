//Example of abstract class that has abstract method
abstract class Bike{  
		  abstract void run();  
		}  
		  
		class lap46 extends Bike{  
		void run(){System.out.println("working correctly..");}  

	public static void main(String[] args) {
			  
			 Bike obj = new lap46();  
			 obj.run();  
			}  

	}

