//Multiple inheritance is not supported through class in java but it is possible by interface, why?
		
	interface Printable{  
		void print();  
	}  
	interface Showable{  
		void print();  
		}  
	  
public	class lap49 implements Printable,Showable{  
		public void print(){System.out.println("hello dinesh");}  
	
	public static void main(String[] args) {
lap49 obj = new lap49();  
					obj.print();  
					 }  
}	
