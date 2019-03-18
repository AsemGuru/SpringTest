package org.cap.pojo;

class  Human{
		   //Overridden method
		   public void eat()
		   {
		      System.out.println("Human is eating");
		   }
		}
		class Boy extends Human{
		   //Overriding method
		   public void eat(){
		      System.out.println("Boy is eating");
		   }
		   
		}
		
		class Monkey extends Boy{
			
			 public void eat(){
			      System.out.println("Monkey is eating");
			   }
		}
		
		   public class Test3 { 
		   
		   public static void main( String args[]) {
		    
		     
			   Boy b= new Boy();
			   Monkey m=new Monkey();
			   b.eat();
			   m.eat();
			   
			   
		      
		   }
		}


		
		
		
	
 


 
