//COUNTER WITH STATIC VARIABLE
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex17;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    static int count=0;//will get memory only once and retain its value  
	  
	Ex17(){  
	count++;  
	System.out.println(count);  
	}  
    public static void main(String[] args) {
        // TODO code application logic here
        	  
	Ex17 c1=new Ex17();  
	Ex17 c2=new Ex17();  
	Ex17 c3=new Ex17();  

    }
    
}



OUTPUT:
1
2
3