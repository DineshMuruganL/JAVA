//WITHOUT THIS KEYWORD
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex20;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex20 {

    /**
     * @param args the command line arguments
     */
         int id;
         String name;  
        Ex20(int id,String name){  
	    id = id;  
	    name = name;  
	    }  
	    void display(){
         System.out.println(id+" "+name);}  
    public static void main(String[] args) {
        // TODO code application logic here
        
	   
	    Ex20 s1 = new Ex20(111,"Karan");  
	    Ex20 s2 = new Ex20(321,"Aryan");  
	    s1.display();  
	    s2.display();  

    }
    
}


OUTPUT:
0 null
0 null