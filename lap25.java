//The this keyword can be passed as argument in the constructor call.
public class lap25 {
	  A4 obj;  
	  lap25(A4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  

	class A4{ 
			  int data=10;  
	  A4(){  
		   lap25 b=new  lap25(this);  
		   b.display();  
		  }  
	
	public static void main(String[] args) {
				   A4 a=new A4();  
				  }  
				}

