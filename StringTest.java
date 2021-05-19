package lesson8;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "1 2 3 4 5 6 7 8 9";
StringBuilder result = new StringBuilder();
for (int index=0; index < a.length(); index++) {
		 result.append(a.charAt(index)).append(" ");
	
		
	}
	
	System.err.println("Result:" + result.toString());
	}
}
	


