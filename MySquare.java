package squares;

public class MySquare {

	static final int MAX = 5;
	
	public static void main(String[] args) {
		double value = 2;
		for( int i = 0; i<MAX; i++) {
			System.out.println(value);
			value = value*value;
		}

		for( int i = 0; i<MAX; i++) {
			System.out.println(value);;
			value = Math.sqrt(value);
		}
	}

}
