//THIS() CONSTRUCTOR CALL
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex21;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex21 {

    /**
     * @param args the command line arguments
     */
           int id;  
	    String name;  
            Ex21(){
                System.out.println("default constructor is invoked");}  
	        Ex21(int id,String name){  
	    this ();//it is used to invoked current class constructor.  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display(){
             System.out.println(id+" "+name);}  
	      
	    public static void main(String args[]){  
	    Ex21 e1 = new Ex21(111,"karan");  
	    Ex21 e2 = new Ex21(222,"Aryan");  
	    e1.display();  
	    e2.display();  
     }
    
}




OUTPUT:
default constructor is invoked
default constructor is invoked
111 karan
222 Aryan