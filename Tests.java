//Walker Sasser
import java.util.*;
public class Tests
{
   private String firstName;
   private String lastName;
   private int[] testScores = new int[5];
   private double averageTestScore;
   private String grade;
  
   public Tests()
   {
   }
 
   public Tests(String firstName, String lastName, int[] scores)
   {
      setFirstName(firstName);
      setLastName(lastName);
      setTestScores(scores);
   }
   
   public String getFirstName() {
     return firstName;
   }
      
   public void setFirstName(String value) {
      firstName = value;
   }
  
   public String getLastName() {
      return lastName;
   }
     
   public void setLastName (String value) {
      lastName = value;
   } 
  
   public int[] getTestScores() {
      return testScores;
   }
   
   public void setTestScores(int[] values) {
      testScores=values;
      averageTestScore=getAverageTestScore();
      grade = getGrade();
   }
   
   public double getAverageTestScore() {
   
      int total = 0;
   
      for (int x = 0; x < testScores.length; x++)
      {      
         total = total + testScores[x];        
      }
             
      return total / testScores.length;   
   } 
     
   public String getGrade() {
   
      if (averageTestScore >= 90)
         return  "A";
      else if (averageTestScore >= 80)
         return  "B";
      else if (averageTestScore >= 70)
         return  "C";
      else if (averageTestScore >= 60)
         return  "D";

      return  "F";     
   }  
    
   //print header
   public String getPrintHeader() {
      
      String result = String.format("%-10s %-10s", "First", "Last");
      
      for (int x = 0; x < testScores.length; x++)
      {
         result = result + " " + String.format("%-6s", "Test" + (x+1));
      }
      
      return result + String.format("%-7s %-5s", "Average", "Grade");
   }
   
   //print results
   public String toString() {
      
      String result = String.format("%-10s %-10s", firstName, lastName);
      
      for (int x = 0; x < testScores.length; x++)
      {
         result = result + " " + String.format("%-6d", testScores[x]);
      }
      
      return result + String.format("%-7s %-5s", getAverageTestScore(), getGrade());
   }
           
}
