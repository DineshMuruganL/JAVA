//Java toString() method
	
package lap;

public class lap91 {
		 int rollno;  
		 String name;  
		 String city;  
		  
		 lap91(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
		   lap91 s1=new lap91(17,"dinesh","chennai");  
		   lap91 s2=new lap91(25,"karthi","india");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  

}
