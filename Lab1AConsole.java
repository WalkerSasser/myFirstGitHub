/*•	Put your name as a comment on the top of the class.
•	Import the scanner package
•	Write the name of the class, perhaps Lab1AConsole
•	Write the main method header  (psvm)
•	Inside main, create the scanner object using System.in as the parameter
•	Ask the user to provide their name and age using the appropriate prompts, and scanner commands.
•	Then print the user’s name and age
*/

//Walker Sasser
import java.util.Scanner;
public class Lab1AConsole
{
public static void main (String[] args)
{

Scanner scan = new Scanner(System.in);

System.out.print("Please enter your name: ");
String name = scan.nextLine();
System.out.print("Please enter your age: ");
int age = scan.nextInt();

System.out.println("Name:\t" + name);
System.out.println("Age: \t" + age);

}
}