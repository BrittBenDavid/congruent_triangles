
/**
 * Line.java
 * This class gets the 2 coordinates from the user: (x1, y1), (x2, y2) and calculates the length between them
 *
 * @author britt twig
 * @version 06/04/2017
 *************/
import java.util.Scanner;
public class Line
{
    public static void main (String[] args)
    {        
        // gets the coordinates
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter 4 integers ");
        System.out.println ("Please enter x1: ");
        int x1 = scan.nextInt ();
        System.out.println ("Please enter y1: ");
        int y1 = scan.nextInt ();
        System.out.println ("Please enter x2: ");
        int x2 = scan.nextInt ();
        System.out.println ("Please enter y2: ");
        int y2 = scan.nextInt ();
        
        // calculates the length with tne appropriate formula
        double length;
        length = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println ("The length of the line between the points (" + x1 + "," + y1 + ") and (" +   x2 + "," + y2 + ") is " + length);
    } // end of method main
} // end of class Line
