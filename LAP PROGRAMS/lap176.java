//JTable class:
	import javax.swing.*;  
	public class lap176 {  
	    JFrame f;  
	lap176(){  
	    f=new JFrame();  
	      
	    String data[][]={ {"17","dinesh","250000"},  
	              {"25","karthi","500000"}};  
	    String column[]={"ID","NAME","SALARY"};  
	      
	    JTable jt=new JTable(data,column);  
	    jt.setBounds(30,40,200,300);  
	      
	    JScrollPane sp=new JScrollPane(jt);  
	    f.add(sp);  
	      
	    f.setSize(300,400);  
	//  f.setLayout(null);  
	    f.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new lap176();  
	}  
	}  
