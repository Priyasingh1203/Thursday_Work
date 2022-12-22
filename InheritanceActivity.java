package oops;
//parent or super class
class Employee1{
	long employeeId; //variable declaration
	String employeeName;
	String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance=250.80;
    double Hra=1000.50; //default value of the variable
    double Salary;
    
    Employee1(long Id,String Name,String address,long phone) //parameterized constructor 
    {
    	employeeId= Id;
    	employeeName= Name;
    	employeeAddress= address;
        employeePhone= phone;
    }
    public void calculateSalary() //method
    {
    	double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
    	System.out.println("The salary:" +Salary);
    }
    
    public void calculateTransportAllowance() //method
    {
    	double TransportAllowance = 0.1*basicSalary;
    	Salary= TransportAllowance+basicSalary;
    	System.out.println("The salary after calculating trasport allowance:" +Salary);
    }
}
//child or sub class
class Manager extends Employee1{
	

	Manager(long Id,String Name,String address,long phone,double salary) //parameterized constructor
    { 
		
		super(Id, Name, address, phone);
    	employeeId= Id;
    	employeeName= Name;
    	employeeAddress= address;
        employeePhone= phone;
        basicSalary=salary;     
        System.out.println("Id:"+Id+"\n"+"Name:"+Name+"\n"+"Address:"+address+"\n"+"Phone:"+phone+"\n"+"Salary:"+salary);
    }   
        public  void calculateTransportAllowance() //method 
        {
        
        	double TransportAllowance = 0.15*basicSalary;
        	Salary= TransportAllowance+basicSalary;
        	System.out.println("The salary after calculating trasport allowance:" +Salary);
        }
        
    
}
//child or sub class
class Trainee extends Employee1{


	Trainee(long Id,String Name,String address,long phone,double salary) //parameterized constructor
    {super(Id, Name, address, phone);
    	employeeId= Id;
    	employeeName= Name;
    	employeeAddress= address;
        employeePhone= phone;
        basicSalary=salary;
        System.out.println("=================================================");
        System.out.println("Id:"+Id+"\n"+"Name:"+Name+"\n"+"Address:"+address+"\n"+"Phone:"+phone+"\n"+"Salary:"+salary); 
        
    }
}
//main class
public class InheritanceActivity {
 public static void main(String args[]) {
   Manager m = new Manager(126534,"Peter","Chennai India",237844, 65000); //object creation
   m.calculateSalary(); //method call
   m.calculateTransportAllowance();
   Trainee t = new Trainee(29846,"Jack","Mumbai India",442085, 45000);
   t.calculateSalary();
   t.calculateTransportAllowance();
}
}