//Simple example of AWT by association
	import java.awt.*;  
	class lap168{  
	lap168(){  
	Frame f=new Frame();  
	  
	Button b=new Button("click me");  
	b.setBounds(30,50,80,30);  
	  
f.add(b);  
	f.setSize(300,300);  
	f.setLayout(null);  
	f.setVisible(true);  
	}  
	public static void main(String args[]){  
	lap168 f=new lap168();  
	}}  
