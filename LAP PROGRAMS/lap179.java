//JSlider
	import javax.swing.*;  
	  
	public class lap179 extends JFrame{  
	  
	public lap179() {  
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
	JPanel panel=new JPanel();  
	panel.add(slider);  
	  
	add(panel);  
	}  
	  
	public static void main(String s[]) {  
	lap179 frame=new lap179();  
	frame.pack();  
	frame.setVisible(true);  
	}  
	}  
