import java.util.Scanner;
class Largest{
	public static void main(String[] args){	
			Scanner input = new Scanner(System.in);
			System.out.print("Enter 1st number: ");
			int a = input.nextInt();
			System.out.print("Enter 2nd number: ");
			int b = input.nextInt();
			System.out.print("Enter 3rd number: ");
			int c = input.nextInt();
				if (a>b){
					System.out.println("The largest among the three is: " + a);
				}
				else if (b>c){
					System.out.println("The largest among the three is: " + b);
				}
				else{
					System.out.println("The largest among the three is: " + c);
				}
	}
}