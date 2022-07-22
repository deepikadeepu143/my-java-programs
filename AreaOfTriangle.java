import java.util.Scanner;
public class AreaOfTriangle
{
	public static void main(String args[])
	{
		float b,h,a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of triangle: ");
		b = sc.nextFloat();
		System.out.print("Enter the height of triangle: ");
		h = sc.nextFloat();
		float s = 0.5f;
		a = s*b*h;
		System.out.println("Area of triangle is: "+a);
	}
}