import java.util.Scanner;
class New{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		System.out.print("Enter a number: ");
		int b = input.nextInt();
		int c = a + b;
		System.out.println("The total is: " + c);
		
	}
}