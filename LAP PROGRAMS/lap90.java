//Understanding problem without toString() method
	class lap90{  
	 int rollno;  
	 String name;  
 String city;  
  
	 lap90(int rollno, String name, String city){  
	 this.rollno=rollno;  
 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   lap90 s1=new lap90(16,"dinesh","chennai");  
	   lap90 s2=new lap90(12,"karthi","mandavelli");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
}  
