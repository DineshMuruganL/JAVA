//Custom Exception

	class InvalidException extends Exception{  
	 InvalidException(String s){  
	  super(s);  
	 }  
	}  
	class lap108{  
	  
	   static void validate(int age)throws InvalidException{  
	     if(age<18)  
	      throw new InvalidException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
      try{  
	      validate(19);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  
