//Java Member inner class
 public class lap109{  
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
 public static void main(String args[]){  
	 lap109 obj=new lap109();  
	  lap109.Inner in=obj.new Inner();  
	  in.msg();  
	 }  
	}  
