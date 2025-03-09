package castingInteger;
import java.util.Scanner;

public class castingInteger {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = 0;
      double userDouble = 0.0;
      char userCharacter;
      String userString;
      
      System.out.println("Enter integer: ");
      userInt = scnr.nextInt();
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
      
      System.out.println("Enter double: ");
      userDouble = scnr.nextDouble();
      
      System.out.println("Enter character: ");
      userCharacter = scnr.next().charAt(0);
      
      System.out.println("Enter string: ");
      userString = scnr.next();
      
      System.out.println(userInt + " " + userDouble + " " + userCharacter + " " + userString);  
      
      // FIXME (2): Output the four values in reverse
      
      System.out.println(userString + " " + userCharacter + " " + userDouble + " " + userInt);  
      
      // FIXME (3): Cast the double to an integer, and output that integer
      
      System.out.println(userDouble + " cast to an integer is " + (int)(userDouble));
      
      return;
   }
}