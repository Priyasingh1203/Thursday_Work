package arrayprogram;

public class SubtractTwoMatrix {

	public static void main(String args[])
	{
		
		int a[][]= {{6,5,4},{9,8,7},{12,11,10}}; //first matrix
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};   //second matrix
		int c[][]= new int[3][3];   //creating third matrix to store the result
		 for(int i=0;i<3;i++) //outer loop for row
		 {
			 for(int j=0;j<3;j++) //inner loop for column
			 {
				 c[i][j]= a[i][j] - b[i][j]; //subtracting the matrices and storing the result to third matrix
				 System.out.print(c[i][j]+" ");     //displaying the result
			 }
			 System.out.println();
		 }
		 
		
     }
    
	
} 
