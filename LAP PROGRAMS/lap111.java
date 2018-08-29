//Java local inner class
	public class lap111{  
	 private int data=30;//instance variable  
	 void display(){  
	  class Local{  
	   void msg(){System.out.println(data);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  lap111 obj=new lap111();  
	  obj.display();  
	 }  
	}  
