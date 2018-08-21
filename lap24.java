//this keyword can be passed as an argument in the method.
public class lap24 {
	 void m(){  
		  System.out.println("method is invoked");  
		  }  
		  void n(){  
		  this.m();//no need because compiler does it for you.  
		  }  
		  void p(){  
		  n();//complier will add this to invoke n() method as this.n()  
		  }
	public static void main(String[] args) {
			lap24 s1 = new lap24();  
			  s1.p();  
			  }  
	}
