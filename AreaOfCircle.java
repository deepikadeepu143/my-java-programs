import java.util.Scanner;
java.lang.Math;
public class AreaOfCircle
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius::");
        double radius = s.nextDouble();
        double perimeter;
        double area;
        if (radius <= 0)
	    {
  	     System.out.println("please enter non zero positive number ");
        }
        else 
	    {
            perimeter = 2 * Math.PI * radius;
            area = Math.PI * radius * radius;
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        }
    }
}