import java.util.Scanner;
class Input{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of times to repeat loop: ");
		int n = input.nextInt();
		for (int i=0; i<n; i++){
			System.out.println("Hi");
		}
	}
}