import java.util.Scanner; //gotta get those scanner objects!
public class CircleCalculation { //class that has all our stuff lol
    public static double calculateDiameter(double r) { //define new method that takes in one double (the radius), and returns the diameter (a double)
        //System.out.println(2 * r); //TEST CODE - used in testing to make sure method works properly
        return 2 * r; //return diameter (double)
    }
    public static double calculateArea(double r) { //define new method that takes in the radius (double) and returns the area (double)
        //System.out.println(Math.PI * r * r); //TEST CODE - used in testing
        return Math.PI * r * r; //return area (double)
    }

    public static double calculateCircumference(double r) { //define new method that takes in the radius (double) and returns the circumference (double)
        double d = calculateDiameter(r); //the circumference works off of the diameter (or 2*radius) so we call the previous function
        //System.out.println(Math.PI * d); //TEST CODE - used in testing
        return Math.PI * d; //return circumference (double
    }
    public static void main(String[] args){ //FINALLY my bestie the MAIN METHOD WOOT WOOT UNTZ UNTZ
        final double radius; //what we will store the user input under
        double d; //diameter
        double c; //circumference
        double a; //area
        Scanner sc = new Scanner(System.in); //create new scanner object
        System.out.println("Please enter the radius of your circle (in cm): "); //promopt user for their radius (always include units kids)
        radius = sc.nextDouble(); //store the next double in radius
        sc.nextLine(); //eat up any leftover stuff (ive gotten into the habit of doing this to clean sc storage)

        d = calculateDiameter(radius); //call diameter function using radius
        System.out.println("Your diameter is: " + d + " cm."); //print result

        a = calculateArea(radius); //call area function using radius
        System.out.println("Your area is: " + a + " cm squared."); //print result (UNITS BABEY)

        c = calculateCircumference(radius); //call circumference method using radius
        System.out.println("Your circumference is: " + c + " cm."); //print result

    }
}
