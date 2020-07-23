import java.util.Scanner;
class Done{
	public static void main (String[] args){
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			System.out.println(number);
			if (number == 1){
				break;
			}
		}
	}
}

