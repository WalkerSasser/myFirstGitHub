//Walker Sasser
import java.util.Scanner;
public class TestTests
{
   public static void main (String[] args)
   {   
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many students do you have? : ");            
      Tests[] Kids = new Tests[scan.nextInt()];

      System.out.print("How many tests scores per student? : ");                  
      int[] scores = new int[scan.nextInt()];
      scan.nextLine();
      
      for (int x = 0; x < Kids.length; x++)
      {      
         Kids[x] = new Tests();
                           
         System.out.println("Enter student " + (x + 1) + "'s info: ");

         System.out.print("\nFirst name: ");
         Kids[x].setFirstName(scan.nextLine());
         
         System.out.print("\nLast name: ");
         Kids[x].setLastName(scan.nextLine());
         System.out.print("\nTest scores (" + scores.length + "): ");
         
         scores=Kids[x].getTestScores();         
         for (int y = 0; y < scores.length; y++)
         {
            scores[y]=scan.nextInt();
         }
         scan.nextLine();
         System.out.println(); 
      }
      
      System.out.println(Kids[0].getPrintHeader());
      int total=0;
      for (int x = 0; x < Kids.length; x++)
      {
         System.out.println(Kids[x].toString());
         total+=Kids[x].getAverageTestScore();
      }
      System.out.println("\nClass Average = " + String.format("%.2f", total*1.0 / Kids.length));
   }
   
}