//Abstract class having constructor, data member, methods etc.
 	abstract class Bike{  
		   Bike(){System.out.println("program is created");}  
		   abstract void run();  
		   void changeGear(){System.out.println("output verified");}  
		 }  
		  
 public	 class lap47 extends Bike{  
		 void run(){System.out.println("working correctly..");}  
		 }  
		 class TestAbstraction2{  

	public static void main(String[] args) {
			  Bike obj = new lap47();  
			  obj.run();  
			  obj.changeGear();  
			 }  

	}


