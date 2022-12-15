import java.util.Scanner;
public class GrossSalary
{
   public  static void main(String args[])
   {
	   String name;
	   double basic_salary, gross_salary;
           double da,hra;
		
	    
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter your name:");
	   name = sc.nextLine();
	
	  
	   System.out.println("Enter your basic salary:");
	   basic_salary = sc.nextDouble();
	
	   if(basic_salary > 1500)
	   {
		    da = basic_salary *0.9;
		    hra=basic_salary*0.2;
		   
	   }
	   else
	   {
		   hra=500;
		   da=basic_salary*0.7;
	   }	   
	gross_salary=da+hra+basic_salary;
        System.out.println("The Gross Salary is  "+ gross_salary);
 }
  }