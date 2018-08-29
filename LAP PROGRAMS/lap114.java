//By implementing the Runnable interface:
	class lap114 implements Runnable{  
	public void run(){  
	System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[]){  
	lap114 m1=new lap114();  
	Thread t1 =new Thread(m1);  
	t1.start();  
	 }  
	}  
