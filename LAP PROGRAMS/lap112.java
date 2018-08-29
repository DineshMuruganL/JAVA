//Java static nested class
	class lap112{  
	  static int data=60;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  lap112.Inner obj=new lap112.Inner();  
	  obj.msg();  
  }  
	}  
