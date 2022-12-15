import java.util.Scanner;
public class NumberPattern2_15_12_22 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print(+j);
            }
            System.out.print("\n");
        }
      
    }
}
