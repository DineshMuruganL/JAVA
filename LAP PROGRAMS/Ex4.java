//OBJECT AND CLASS
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */ int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w; 
         }
           void calculateArea(){
        System.out.println(length*width);}  
	 
	   
    public static void main(String[] args) {
        // TODO code application logic here
        	
          Ex4 r1=new Ex4();  
	  Ex4 r2=new Ex4();  
	  
	  r1.insert(12,4);  
	  r2.insert(2,14);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  

    }
    


OUTPUT:
48
28