import java.util.Scanner;
class fact{
	public static void main(String [] args){
		long f = 1;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number to get the factorial: ");
		int n = input.nextInt();

			for (int i = 1; i <= n; ++i){
				f = f * i;
			}

		System.out.println("The factorial of " + n + " is " + f);

	}
}