//Object cloning
		
		public	class lap57 implements Cloneable{  
			int rollno;  
			String name;  
			  
			lap57(int rollno,String name){  
			this.rollno=rollno;  
			this.name=name;  
			}  
			  
			public Object clone()throws CloneNotSupportedException{  
			return super.clone();  
			}  
			  
			public static void main(String args[]){  
			try{  
			lap57 s1=new lap57(16,"dinesh");  
			  
			lap57 s2=(lap57)s1.clone();  
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
			  
			}catch(CloneNotSupportedException c){}  
			  
			}  
}


