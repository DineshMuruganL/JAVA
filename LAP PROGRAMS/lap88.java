// capacity() 
	
package lap;

public class lap88 {
	  
		public static void main(String args[]){  
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("i m dinesh kumar m");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		}  

}
