import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        // Get x coordinate
        System.out.print("Enter x:");
        int newX = scan.nextInt();

        //Get y coordinate
        System.out.print("Enter y:");
        int newY = scan.nextInt();

        /**
         * Create a circle with those x and y coordinates Create an instance
         * of a Circle at (x,y) with radius=16.0 called circle16;
         * Create another instance of a Circle at (14,12) with radius=40.0 called circle40;
         */

        Circle circle40 = new Circle(new Point(14, 12), 40);
        Circle circle16 = new Circle(new Point(newX,newY), 16);

        //See if they intersect
        if (circle40.intersects(circle16))
        {
            System.out.println("Circles intersect!");
        }
        else {
            System.out.println("Circles do not intersect!");
        }

    }
}
