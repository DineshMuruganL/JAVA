//OVERLOAD OF CHANGE DATA TYPE OF ARGU
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    void sum(int a,int b){
        System.out.println(a+b);}
      
	  void sum(double a,double b){
              System.out.println(a+b);
          }
	  
	
    public static void main(String[] args) {
        // TODO code application logic here
           
	  Ex8 obj=new Ex8();  
	  obj.sum(10.9,10.1);  
	  obj.sum(20,200);  
	  
	  

    }
    
}


OUTPUT:
21.0
220
