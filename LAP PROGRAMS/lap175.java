//JComboBox class:
	import javax.swing.*;  
	public class lap175 {  
	JFrame f;  
	lap175(){  
	    f=new JFrame("Combo ex");  
	      
	    String country[]={"India","Aus","U.S.A","England","Newzeland"};  
      
    JComboBox cb=new JComboBox(country);  
	    cb.setBounds(50, 50,90,20);  
	    f.add(cb);  
	      
	    f.setLayout(null);  
	    f.setSize(400,500);  
	    f.setVisible(true);  
	      
	}  
	public static void main(String[] args) {  
	    new lap175();  
	      
	}  
	}  
