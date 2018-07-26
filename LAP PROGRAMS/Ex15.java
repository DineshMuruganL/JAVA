//COPY CONSTRUCTOR
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex15;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
     int id;  
	    String name;  	  
            Ex15(int i,String n){  
	    id = i;  
	    name = n; 	    }  	      
	    Ex15(Ex15 s){  
	    id = s.id;  
            name =s.name;  	    }  
	    void display(){
                System.out.println(id+" "+name);}  
    public static void main(String[] args) {
        // TODO code application logic here
   
	    
	      Ex15 s1 = new   Ex15(17,"Dinesh");  
	    Ex15 s2 = new   Ex15(s1);  
	    s1.display();  
	    s2.display();  
	   }  

    }
    


OUTPUT:
17 Dinesh
17 Dinesh