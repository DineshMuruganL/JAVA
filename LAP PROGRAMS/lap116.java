//join() method
	class lap116 extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]){  
	 lap116 t1=new lap116();  
	 lap116 t2=new lap116();  
	 t1.start();  
	 try{  
  t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	  
	 t2.start();  }  
	}  
