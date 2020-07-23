class swap{
	public static void main (String[] args){
		int a = 5, b = 1;
		System.out.println("Before Swapping: ");
		System.out.println("a = " + a + " b = " + b);
		// c = a;
		// a = b;
		// b = c;
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("After Swapping: ");
		System.out.println("a = " + a + " b = " + b);
	}
}