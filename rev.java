import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		int rev = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a numnber to reverse: ");
		int num = input.nextInt();
			while (num != 0){
				int digit = num % 10;
				rev = num * 10 + digit;
				num = num / 10;
			}
		System.out.println("The reverse is: " + rev);
	}
}