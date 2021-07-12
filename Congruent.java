
/************
 * Congruent.java
 * This class gets the 6 coordinates of 2 triangles and check if they are congruent
 *
 * @author britt twig
 * @version 06/04/2017
 *************/
import java.util.Scanner;
public class Congruent
{
    public static void main (String[] args)
    { 
        //gets the coordinates of the 2 trangles from the user
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter 6 integers, the coordinates of the first triangle ");
        System.out.println ("Please enter x11: ");
        int x11 = scan.nextInt ();
        System.out.println ("Please enter y11: ");
        int y11 = scan.nextInt ();
        System.out.println ("Please enter x12: ");
        int x12 = scan.nextInt ();
        System.out.println ("Please enter y12: ");
        int y12 = scan.nextInt ();
        System.out.println ("Please enter x13: ");
        int x13 = scan.nextInt ();
        System.out.println ("Please enter y13: ");
        int y13 = scan.nextInt ();
    
        System.out.println ("Please enter 6 integers, the coordinates of the second triangle ");
        System.out.println ("Please enter x21: ");
        int x21 = scan.nextInt ();
        System.out.println ("Please enter y21: ");
        int y21 = scan.nextInt ();
        System.out.println ("Please enter x22: ");
        int x22 = scan.nextInt ();
        System.out.println ("Please enter y22: ");
        int y22 = scan.nextInt ();
        System.out.println ("Please enter x23: ");
        int x23 = scan.nextInt ();
        System.out.println ("Please enter y23: ");
        int y23 = scan.nextInt ();
    
        //calculates the lengths of the first triangle with tne appropriate formula
        double a1;
        double b1;
        double c1;
        a1 = Math.sqrt((Math.pow((x11 - x12), 2) + Math.pow((y11 - y12), 2)));
        b1 = Math.sqrt((Math.pow((x12 - x13), 2) + Math.pow((y12 - y13), 2)));
        c1 = Math.sqrt((Math.pow((x13 - x11), 2) + Math.pow((y13 - y11), 2)));
        System.out.println ("The first triangle is (" + x11 + "," + y11 + ") (" + x12 + "," + y12 + ") (" + x13 + "," + y13 + ") ");
        System.out.println ("Is lengths are " + a1 + "," + b1 + "," + c1) ;
    
        // calculates the lengths of the second triangle with tne appropriate formula
        double a2;
        double b2;
        double c2;
        a2 = Math.sqrt((Math.pow((x21 - x22), 2) + Math.pow((y21 - y22), 2)));
        b2 = Math.sqrt((Math.pow((x22 - x23), 2) + Math.pow((y22 - y23), 2)));
        c2 = Math.sqrt((Math.pow((x23 - x21), 2) + Math.pow((y23 - y21), 2)));
        System.out.println ("The second triangle is (" + x21 + "," + y21 + ") (" + x22 + "," + y22 + ") (" + x23 + "," + y23 + ") ");
        System.out.println ("Is lengths are " + a2 + "," + b2 + "," + c2) ;
        
        //check if the triangles are congruents by comparing the ribs of them, and print the answer 
        boolean okFlag = false;
        if (Math.max(Math.max(a1, b1), Math.max(b1, c1)) == Math.max(Math.max(a2, b2), Math.max(b2, c2)))
            if (Math.min(Math.min(a1, b1), Math.min(b1, c1)) == Math.min(Math.max(a2, b2), Math.min(b2, c2)))
                if (a1 + b1 + c1 == a2 + b2 + c2)
                    okFlag = true;
        if (okFlag)
            System.out.println ("The triangles are congruents.");
        else
            System.out.println ("The triangles are not congruents.");
    } // end of method main
} // end of class Congruent