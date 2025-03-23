

package HalfArrowProject;

import java.util.Scanner;

public class DrawHalfArrow {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int arrowBaseHeight;
	      int arrowBaseWidth;
	      int arrowHeadWidth;
	      int i;
	   
	      
	      System.out.println("Enter arrow base height:");
	      arrowBaseHeight = scnr.nextInt();
	     
	      
	      System.out.println("Enter arrow base width:");
	      arrowBaseWidth = scnr.nextInt();
	   
	      
	      System.out.println("Enter arrow head width:");
	      arrowHeadWidth = scnr.nextInt();
	      for (i=arrowHeadWidth; arrowHeadWidth <= arrowBaseWidth; ++i) {
	            System.out.println("Enter arrow head width:");
	            arrowHeadWidth = scnr.nextInt();
	      }
	      
	      System.out.println();
	     
	      
	      // Draw arrow base (height = 3, width = 2)
	      for (i=0; i<arrowBaseHeight; ++i) {
	            System.out.println("*".repeat(arrowBaseWidth));
	      }
	           
	      // Draw arrow head (width = 4)
	      for (i=arrowHeadWidth; i>0; --i) {
	      System.out.println("*".repeat(i));
	      }
	   }
}
