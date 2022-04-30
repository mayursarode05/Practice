package Lab_3_Exception;

import java.util.Scanner;

interface IntOperations
{
	
}
public class MyNumber implements IntOperations 
{
	
     private int a,flag=0;
     
     MyNumber()
     {
    	 a=0;
     }
     MyNumber(int a)
     {
    	 this.a=a;
     }
     void Positive(int a)
     {
    	 this.a=a;
    	 if(a>0)
    	 {
    		 System.out.println("Entered number is Positive");
    	 }
    	 else
    	 {
    		 System.out.println("Entered number is Negative");
    	 }
     }
    
     void Even(int a)
     {   this.a=a;
    	 if(a%2==0)
    	 {
    		 System.out.println("Entered number is Even");
    	 }
    	 else
    	 {
    		 System.out.println("Entered number is Odd");
    	 }
     }
   
     void Prime(int a)
     {   this.a=a;
    	 for(int i=2;i<a/2;i++)
    	 {
    	 if(a%1==0)
    	 {
    		 flag=1;
    		 break;
    	 }
    	 }
    	 if(flag==0)
    	 {
    		 System.out.println("It's a Prime number");
    	 }
    	 else
    	 {
    		 System.out.println("It's not a Prime number");
    	 }
     }
	public static void main(String[] args) 
	{
		int choice;
		Scanner s=new Scanner(System.in);
		MyNumber x=new MyNumber();
		Integer i=Integer.parseInt(args[0]);
		MyNumber m=new MyNumber(i);
		do {
		System.out.println("!!!....WelCOme to Java Apploication....!!!");
		System.out.println();
		System.out.println("Enter your choice = ");
		System.out.println("1. To Check number is Positive");
		System.out.println("2. To Check number is Negative");
		System.out.println("3. To Check number is Even");
		System.out.println("4. To Check number is Odd");
		System.out.println("5. To Check number is Prime");
		System.out.println("0. !!!!...EXIT...!!!!");
		choice =s.nextInt();
		switch(choice)
		{
		case 1: x.Positive(i); break;
		case 2: x.Positive(i); break;
		case 3: x.Even(i); break;
		case 4: x.Even(i); break;
		case 5: x.Prime(i); break;
		case 0: System.out.println("!!!!...Thank You...!!!!");
		
		}
		}while(choice!=0);
	}

}
