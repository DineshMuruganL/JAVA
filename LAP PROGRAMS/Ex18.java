//STATIC METHOD
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    int rollno;  
     String name;  
	     static String college = "ITS";  
	       	     static void change()
                     {  	     college = "RIT";  
	     }  
	  
	     Ex18(int r, String n){  
	     rollno = r;
 	     name = n;  
	     }  
	  
	     void display ()
             {
                 System.out.println(rollno+" "+name+" "+college);
              }
    public static void main(String[] args) {
        // TODO code application logic here
          	  	    
	    Ex18.change();  
	    Ex18 s1 = new Ex18 (11,"Kamaran"); 
            Ex18 s2 = new Ex18 (22,"Ariya");  
	    Ex18 s3 = new Ex18 (33,"Simbhu");  
	  
	    s1.display();  
	    s2.display();
 	    s3.display();  
	    }  

    }
    

OUTPUT:
11 Kamaran RIT
22 Ariya RIT
33 Simbhu RIT