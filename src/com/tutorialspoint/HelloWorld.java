package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
	  System.out.println("Printing the message"); 
      System.out.println("Your Message : " + message);
   }
   
   public void init() throws InterruptedException{
	 System.out.println("The bean is being initialized");
   }
   
   public void destroy() throws InterruptedException{
	 System.out.println("The bean destruction is being initialized");
	 Thread.sleep(5000); 
	 System.out.println("The bean has been destroyed");
   }
   
}
