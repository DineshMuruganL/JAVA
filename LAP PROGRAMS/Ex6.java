//MULTIPLE OBJECT
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
     int length;  
	 int width;  	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;
          
	 }  
         void calculateArea(){
        System.out.println(length*width);
    }  
	    
    public static void main(String[] args) {
        // TODO code application logic here
           
	  Ex6 r1=new Ex6();
          Ex6 r2=new Ex6();//creating two objects  
	    
	  r1.insert(10,4);  
	  r2.insert(2,10);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  

	}

    

OUTPUT:    
40
20

