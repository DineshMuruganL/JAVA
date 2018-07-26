//WHERE TO USE THIS() CONSTRUCTOR CALL
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex22;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex22 {

    /**
     * @param args the command line arguments
     */
            int id;  
	    String name;  
	    String city;  
	      
	    Ex22(int id,String name){
  	    this.id = id;  
	    this.name = name;  
	    }  
	    Ex22(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
    public static void main(String[] args) {
        // TODO code application logic here
            
	    Ex22 e1 = new Ex22(11,"karuna");  
	    Ex22 e2 = new Ex22(22,"Ariya","tamil");  
	    e1.display();  
	    e2.display();  

    }
    
}



OUTPUT:
11 karuna null
22 Ariya tamil