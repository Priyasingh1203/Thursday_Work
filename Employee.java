import java.util.Scanner;
public class Employee
{
   public  static void main(String args[])
   {
	   int id;
	   String name;
	   long salary, bonus= 2500,current_yr = 2022,joining_yr;
	    
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter your name:");
	   name = sc.nextLine();
	
	   
	   System.out.println("Enter your salary:");
	   salary = sc.nextLong();
	
	  
	   System.out.println("Enter the joining year:");
	   joining_yr = sc.nextLong();
	   
	   if(current_yr-joining_yr > 3)
	   {
		   salary = salary + bonus;
		   System.out.println("The total amount is " +salary);
	   }
	   else
            {
		  
		   System.out.println("The total amount is " +salary);
	   }
   }
 
   
}

