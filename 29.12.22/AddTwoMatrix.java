package arrayprogram;

public class AddTwoMatrix {

	public static void main(String args[])
	{
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}}; //First matrix
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}}; //Second Matrix
		int c[][]= new int[3][3];  //creating Third Matrix to store te sum of the matrices
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 c[i][j]= a[i][j] + b[i][j]; //Sum of two matrices
				 System.out.print(c[i][j]+" ");  //displaying the result  
			 }
			 System.out.println();
		 }
		 
		
     }
    
	
} 
