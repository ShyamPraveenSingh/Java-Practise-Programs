import java.util.Scanner;
class Vowel{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = input.charInt(); // this line causes error; character input

		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " is a vowel");
				break;
			default:
				System.out.println(ch + " is a consonant");
		}
	}
}