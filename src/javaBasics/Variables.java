package javaBasics;

public class Variables {

	public static void main(String[] args) {
		
		/*String - stores text, such as "Hello". String values are surrounded by double quotes
		int - stores integers (whole numbers), without decimals, such as 123 or -123
		float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		boolean - stores values with two states: true or false*/
		
		String name = "Prasad S";
		System.out.println(name);
		
		int myNum = 15;
		System.out.println(myNum);
		
		myNum = 20;  // myNum is now 20
		System.out.println(myNum);
		
		final int myNum1 = 15;
		//myNum1 = 20;  // will generate an error: cannot assign a value to a final variable
		
		int myNum2 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		System.out.println(myNum2);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		
	}
}
