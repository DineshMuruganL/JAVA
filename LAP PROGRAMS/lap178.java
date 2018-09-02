//JProgressBar class:
	import javax.swing.*;  
	public class lap178 extends JFrame{  
	JProgressBar jb;  
	int i=0,num=0;  
	  
	lap178(){  
	jb=new JProgressBar(0,2000);  
	jb.setBounds(40,40,200,30);  
	      
	jb.setValue(0);  
	jb.setStringPainted(true);  
	      
	add(jb);  
	setSize(400,400);  
	setLayout(null);  
	}  
	  
	public void iterate(){  
	while(i<=2000){  
	  jb.setValue(i);  
	  i=i+20;  
	  try{Thread.sleep(150);}catch(Exception e){}  
	}  
	}  
	public static void main(String[] args) {  
	    lap178 m=new lap178();  
	    m.setVisible(true);  
	    m.iterate();  
	}  
	}  
