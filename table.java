import java.util.Scanner;
class Table{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to get the multiplication table: ");
		int n = input.nextInt();

			for (int i = 1; i<=10; i++){
				int t = i * n;
				System.out.println(n + " x " + i + " = " + t);
			}
	}
}