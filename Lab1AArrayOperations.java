//Walker Sasser
import java.util.Random;
public class Lab1AArrayOperations
{
   public static void main (String[] args)
   {
   
      Random ran = new Random();
   
      int[] nums = {1, 4, 13, 43, -25, 17, 22, -37, 29};
      int largestValue = findLargest(nums);
      System.out.print("Largest value in array:\t" + largestValue + "\n");
      
      int[] data = new int[20];
      for (int b = 0; b < data.length; b++)
      {
         int number = ran.nextInt(100) + 1;
         if (number % 2 != 0)
            number = number * -1;
         data[b] = number;
      }
      
      int dataMax = findLargest(data);
      int numsMax = findLargest(nums);
      
      System.out.print("Sum of largest values from nums and data:\t" + (dataMax + numsMax));
      
      System.out.print("\nContent of data: ");
      
      for (int b = 0; b < data.length; b++)
      {
         System.out.print(data[b] + " ");
      }
      
      int curSeriesLength = 0;
      int seriesLength = 0;
      //list of concurrent positives
      for (int x = 0; x < data.length; x++)
      {
         if (x >= 0)
         {
            if (data[x] > 0)
               curSeriesLength = curSeriesLength + 1;
            else
            {
               if (curSeriesLength > seriesLength)
               seriesLength = curSeriesLength;
               
               curSeriesLength = 0;
            }
         }
      }
      
      System.out.println("\nLength of longest positive series: " + seriesLength);
   }

   public static int findLargest (int[] x)
   {
   
      int max = x[0];
   
      for (int a = 0; a < x.length; a++)
      {
         if (x[a] > max)
            max = x[a];
      }
   
      return max;
   }

}