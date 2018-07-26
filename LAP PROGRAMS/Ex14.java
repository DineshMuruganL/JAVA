//CONSTRUCTOR OVERLOADING
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14;

/**
 *
 * @author DINESHKUMAR
 */

public class Ex14 {

    /**
     * @param args the command line arguments
     */
            int id;
  	    String name;  
	    int age;  
	    Ex14(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Ex14(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
    public static void main(String[] args) {
        // TODO code application logic here
       	 
	    
	    Ex14  s2 = new Ex14 (17,"Dinesh",18);  
	   
	    s2.display();  
	   }  

    }
    


OUTPUT:
17 Dinesh 18