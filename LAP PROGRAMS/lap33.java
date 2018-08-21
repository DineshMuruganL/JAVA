//Solution by super keyword
public class lap33 {
		  int speed=80;  
		}  
		  
		class Bike4 extends lap33{  
		  int speed=200;  
		      
		  void display(){  
		   System.out.println("the speed is"+super.speed);//will print speed of Vehicle now  
		  }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   Bike4 b=new Bike4();  
			   b.display();  
			  	}

}
