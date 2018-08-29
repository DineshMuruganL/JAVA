//Java anonymous inner class
	abstract class Person{  
	  abstract void eat();  
	}  
	class lap110{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
	  void eat(){System.out.println("nice playing");}  
	  };  
	  p.eat();  
	 }  
	}  
