package javaBasics;

public class SwitchCondition {
	
	public static void main(String[] args) {
		
		int i = 3;
		
		switch(i)
		{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("Condition not in the case");
		}
		
		int j = 5;
		switch(j)
		{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("one");
				break;
			case 3:
				System.out.println("one");
				break;
			default:
				System.out.println("Condition not in the case");
		}
	}

}
