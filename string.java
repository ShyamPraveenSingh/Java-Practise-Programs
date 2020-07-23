import java.util.Scanner;
class string{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a text: ");
		String s = input.nextLine();
		System.out.println("\t Details... \n");
		System.out.println("The entered string is : " + s);
		System.out.println("\n The length of the string is: " + s.length());
		System.out.println("\n The extraction of string is : " + s.substring(2, 4));
		System.out.println("\n The index is: " + s.indexOf("Singh"));

	}
}