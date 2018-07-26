//OVERLOAD OF CHNGE NO.OF ARGU
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    void sum(int a,int b){
        System.out.println(a+b);}  
	  void sum(int a,int b,int c){
              System.out.println(a+b+c);}
    public static void main(String[] args) {
        // TODO code application logic here
          
	  	 
	  Ex7 obj=new Ex7();  
	  obj.sum(15,10,17);  
	  obj.sum(25,20);  
	  
	  }  
    
}


OUTPUT:
42
45
