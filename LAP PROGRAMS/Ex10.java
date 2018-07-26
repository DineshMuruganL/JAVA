//OVERLOAD WITH TYPE PROMOTION
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    void sum(int a,long b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
    public static void main(String[] args) {
        // TODO code application logic here
        
 
	  Ex10 obj=new Ex10();  
	  obj.sum(20,24);//now second int literal will be promoted to long  
	  obj.sum(20,102,20);  
	  
	  }  

    }
    


OUTPUT:
44
142
