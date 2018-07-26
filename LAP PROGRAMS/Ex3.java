//OBJECT AND CLASS MAINTAIN STU RECORDS
PROGRAM:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author DINESHKUMAR
 */
public class Ex3 {
        int rollno;  
	 String name;  
        void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){
        System.out.println(rollno+" "+name);}//method 
    public static void main(String[] args) {
        // TODO code application logic here
          Ex3 s1=new Ex3();  
	  Ex3 s2=new Ex3();  
	  
	  s1.insertRecord(17,"Dinesh");  
	  s2.insertRecord(25,"Karthi");  
	  
	  s1.displayInformation();  
	  s2.displayInformation();  
	  	 } 
 	}  


OUTPUT:
        17 Dinesh
        25 Karthi

