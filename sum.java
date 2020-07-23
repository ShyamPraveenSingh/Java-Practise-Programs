import java.util.Scanner;
class Sum{
	public static void main(String [] args){
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to get the sum: ");
		int num = input.nextInt();

			for (int i = 0; i<=num; i++){
				sum = sum + i;
			}
		System.out.println("The sum is: " + sum);
	}
}	