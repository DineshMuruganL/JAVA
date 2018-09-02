//JColorChooser class
	import java.awt.event.*;  
	import java.awt.*;  
	import javax.swing.*;  
	  
	public class lap177 extends JFrame implements ActionListener{  
	JButton b;  
	Container c;  
	  
lap177(){  
	    c=getContentPane();  
    c.setLayout(new FlowLayout());  
	      
	    b=new JButton("color");  
	    b.addActionListener(this);  
	      
	    c.add(b);  
	}  
	  
	public void actionPerformed(ActionEvent e) {  
	Color initialcolor=Color.RED;  
	Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);  
	c.setBackground(color);  
	}  
	  
	public static void main(String[] args) {  
	    lap177 ch=new lap177();  
	    ch.setSize(400,400);  
	    ch.setVisible(true);  
	    ch.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}  
	}  
