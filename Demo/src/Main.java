
class Main {

	static int c = 0;

	Main() {
		c++;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Main m1 = new Main();
		Main m2 = new Main();

		Main m3 = new Main()    ;
	}

}
