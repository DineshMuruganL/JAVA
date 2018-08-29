//By extending Thread class:
	class lap113 extends Thread{  
	public void run(){  
	System.out.println("thread is running...");  
	}  
	public static void main(String args[]){  
	lap113 t1=new lap113();  
	t1.start();  
	 }  
	}  
