package loops;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			  if (i == 6) {
			    break;
			  }
			  System.out.println(i);
			}
		
		for (int i = 0; i < 10; i++) {
			  if (i == 5) {
				  System.out.println("It is at " +i);
			    continue;
			  }
			  System.out.println(i);
			}
		
	}
}
