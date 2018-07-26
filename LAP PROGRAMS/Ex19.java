//WITH THIS KEYWORD
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex19 {

    /**
     * @param args the command line arguments
      */
            int id;  
	    String name;  
	      
	    Ex19(int id,String name){  
             this.id = id;  
	    this.name = name;  
	    }  
	    void display(){
         System.out.println(id+" "+name);}  
    public static void main(String[] args) {
        // TODO code application logic here
             
	    Ex19 s1 = new Ex19 (11,"Kumar");  
	    Ex19 s2 = new Ex19(22,"Ariya");  
	    s1.display();  
	    s2.display();  

    }
    
}



OUTPUT:
11 Kumar
22 Ariya