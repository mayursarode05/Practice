package Interface;

interface companyDetails
{
   String companyname="TaTa PVT LTD";
   
   void enroll();

   
   default void message()
   {
	 System.out.println("Welcome to all of you");  
   }
 
	
}

interface distributors
{
	String name="Tata distrubutors";
	
	void ragistration();
	
}


public class Product implements companyDetails,distributors 

{
	 public void enroll()
	 {
		System.out.println("Entroll number is 1254"); 
	 }

	   
	
	  public void ragistration()
	  {
		 System.out.println("Ragistration is done"); 
	  }
        
	public static void main(String[] args) 
	{
      Product p=new Product();
      p.enroll();
      p.ragistration();
      p.message();
	}

}
