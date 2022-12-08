import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args)
    {
 
        int n;
      
        int p = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        int temp = n;

        while (n > 0) {
 
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
 
        
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
    }
}