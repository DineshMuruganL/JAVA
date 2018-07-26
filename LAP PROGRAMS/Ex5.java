//ANONYMOUS OBJECT
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    void fact(int  n){  
	  int fact=1;  
	  for(int i=1;i<=n;i++){  
	   fact=fact*i;  
          }  
	 System.out.println("factorial is "+fact);  
          }
    
    public static void main(String[] args) {
        // TODO code application logic here
       	 
	new Ex5().fact(4);//calling method with annonymous object
         }  
    }
	 
	  
	  
OUTPUT:	 
factorial is 24

    

