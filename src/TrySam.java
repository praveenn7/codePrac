
public class TrySam {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		sb.deleteCharAt(5); // Removes the space
		sb.insert(5, "!"); // Adds '!' at index 5
		String result = sb.toString(); // result is "Hello!"
		System.out.println(result);

	}

}
