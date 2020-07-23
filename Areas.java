import java.util.Scanner;
class Areas{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		float l = input.nextFloat();
		System.out.println("Enter the breadth: ");
		float b = input.nextFloat();
		float area = l * b;
		System.out.println("The area is : " + area);
	}
}