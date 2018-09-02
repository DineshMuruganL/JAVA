//displaying image in swing:
	import java.awt.*;  
import javax.swing.JFrame;  
	  
public class lap183 extends Canvas{  
	      
	    public void paint(Graphics g) {  
	  
	        Toolkit t=Toolkit.getDefaultToolkit();  
	        Image i=t.getImage("b.jpg");  
	        g.drawImage(i, 120,100,this);  
	          
	    }  
	        public static void main(String[] args) {  
	        lap183 m=new lap183();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(400,400);  
	        f.setVisible(true);  
	    }  
	  
	}  
