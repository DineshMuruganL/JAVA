//currentThread()
	public class lap118 extends Thread{  
	 public void run(){  
	  System.out.println(Thread.currentThread().getName());  
	 }  
	  
	 public static void main(String args[]){  
	  lap118 t1=new lap118();  
	  lap118 t2=new lap118();  
	  
	  t1.start();  
	  t2.start();  
	 }  
	}  
