public class Triangle {

	private int width;
	
	public Triangle(int aWidth) {
		width = aWidth;
	}
	
	public String toString()
	{
		String result = "";
		for(int i=1; i<=width; i++) {
			for(int j=1; j<=i; j++)
				result = result + "[]";
			result = result + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Triangle small = new Triangle(3);
		System.out.println(small.toString());
		
		Triangle large = new Triangle(15);
		System.out.println(large.toString());
	}
}
