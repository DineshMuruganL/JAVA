//Another example of java instanceof operator
	class Animal{  
		 void eat(){System.out.println("1st is running...");}  
		}  
		  
	public	class lap45 extends Animal{  
	 void eat(){System.out.println("2nd is running...");}  

	public static void main(String[] args) {
			  
			  Animal a=new lap45();  
			  a.eat();  
			 }  

	}


