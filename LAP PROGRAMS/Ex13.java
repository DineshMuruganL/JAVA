//PARAMETERIZED CONSTRUCTOR
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

/**
 *
 * @author DINESHKUMAR
 */

public class Ex13 {

    /**
     * @param args the command line arguments
     */
           int id;  
	    String name;  
	      
	    Ex13(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){
                System.out.println(id+" "+name);}  
    public static void main(String[] args) {
        // TODO code application logic here
            Ex13 s1 = new Ex13(17,"Kinesh");  
	    Ex13 s2 = new Ex13(25,"karthi");  
	    s1.display();  
	    s2.display();  

    }
    
}



OUTPUT:
17 Kinesh
25 karthi