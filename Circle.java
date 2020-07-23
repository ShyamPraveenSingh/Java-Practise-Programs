import java.util.Scanner;
class Circle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	int r = input.nextInt();
	double area = 3.14 * r * r;
	System.out.println("The area of the circle is : " + area);
	input.close();
	}
}