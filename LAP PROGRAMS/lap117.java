//Naming a thread
	class lap117 extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
	  lap117 t1=new lap117();  
	  lap117 t2=new lap117();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	   
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("dinesh");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}
