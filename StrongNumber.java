import java.util.*;
public class StrongNumber{
   
   public static void main(String[] args) {

      //declare an int variable and initialization done
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value:");
      num = sc.nextInt();

      //variable declaration
      int factorial,digit,i,sum = 0;

      //transfer the input value to a temporary variable
      int temp = num;

      //start looping for the operation
      while(temp != 0) {
         i = 1;
         factorial = 1;

         //extracting the digit
         digit = temp % 10;

         //get the factorial of the digit
         while(i <= digit) {
            factorial = factorial * i;
            i++;
         }

         //store the sum value
         sum = sum + factorial;

         //removing the digit one by one
         temp = temp / 10;
      }

      //check condition
      if(sum == num)
         //if sum value is equal to input number
         System.out.println(num + " is a strong number");
      else
        //if sum value is not equal to input number
         System.out.println(num + " is not a strong number");
   }   
}