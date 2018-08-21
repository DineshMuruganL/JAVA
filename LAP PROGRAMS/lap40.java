//Java Runtime Polymorphism	class lap40{  
		double Interest(){return 0;}  
		}  
		  
		class SBI extends lap40{  
		double Interest(){return 2.05;}  
		}  
		  
		class ICICI extends lap40{  
		double Interest(){return 5.12;}  
		}  
		class AXIS extends lap40{  
		double Interest(){return 9.5;}  
		}  
		  
		class Test3{  
	
	public static void main(String[] args) {
			lap40 b1=new SBI();  
			lap40 b2=new ICICI();  
			lap40 b3=new AXIS();  
			System.out.println("SBI Rate of Interest: "+b1.Interest());  
			System.out.println("ICICI Rate of Interest: "+b2.Interest());  
			System.out.println("AXIS Rate of Interest: "+b3.Interest());  
			}  

	}


