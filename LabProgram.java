package countUserText;

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      String userText;
	      int Index;
	      
	      // This program will exclude certain characters from a string and print the number of characters.
	   
	      userText = scnr.nextLine();  // Gets entire line, including spaces. 
	      userText = userText.replace(" ","");
	      userText = userText.replace(".","");
	      userText = userText.replace("!","");
	      userText = userText.replace(",","");
	      
	      Index = userText.length();
	      
	      System.out.println(Index);
	      
	      scnr.close();
	   }
	
}
