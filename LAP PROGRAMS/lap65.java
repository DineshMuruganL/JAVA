//call by value in java
	
public class lap65 {
		 int data=500;  
		  
		 void change(int data){  
		 data=data+100;//changes will be in the local variable only
		 
		  
		 }  
		     
	 public static void main(String args[]){  
		   lap65 op=new lap65();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(1);  
		   System.out.println("after change "+op.data);  
		  
		 }  

}
