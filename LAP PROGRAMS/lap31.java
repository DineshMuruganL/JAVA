//Example of method overriding
public class lap31 {
	void run(){
		System.out.println("1st function is running");
		}  
}
class Bike2 extends lap31{  
void run(){
	System.out.println("2nd function running ");
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike2 obj = new Bike2();  
			obj.run();  
		  

	}

}
