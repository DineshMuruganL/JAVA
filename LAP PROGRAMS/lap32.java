//super is used to refer immediate parent class instance variable.
//Problem without super keyword

public class lap32 {

		  int speed=50;  
		}  
		class Bike3 extends lap32{  
		  int speed=220;  
		  void display(){  
		   System.out.println("the speed is"+speed);//will print speed of Bike   
		  }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   Bike3 b=new Bike3();  
			   b.display();  
			}  
			}

	