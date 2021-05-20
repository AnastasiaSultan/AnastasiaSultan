package lesson8;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		result.append(" ");
		for (int index=1; index < 10; index++) {
				 sb.append(index).append(result);
			
				 result.append(" ");
			}
			
			System.err.println("Result=" + sb);
			}
		}
	

	


