package javaBasics;

public class Strings {

	public static void main(String[] args) {

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt2.toLowerCase());   // Outputs "hello world"
		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate")); // Outputs 7
		
		// Java String Concatenation
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName1.concat(lastName1));
		
		// Java Numbers and Strings
		int x = 10;
		int y = 20;
		int z = x + y;  // z will be 30 (an integer/number)
		System.out.println(z);
		
		String xx = "10";
		String yy = "20";
		String zz = xx + yy;  // z will be 1020 (a String)
		System.out.println(zz);
		
		String xxx = "10";
		int yyy = 20;
		String zzz = xxx + yyy;  // z will be 1020 (a String)
		System.out.println(zzz);
		
		// Java Special Characters
		/*
		 Escape character	Result	Description
		\'	'	Single quote
		\"	"	Double quote
		\\	\	Backslash
		 */
		String newText = "We are the so-called \"Vikings\" from the north.";
		String newText1 = "It\'s alright.";
		
		System.out.println(newText);
		System.out.println(newText1);
		
		String txtBackslash = "The character \\ is called backslash.";
		
		/*
		 Other common escape sequences that are valid in Java are:
		 ========================================================
		 Code	Result	Try it
		\n	New Line	
		\r	Carriage Return	
		\t	Tab	
		\b	Backspace	
		\f	Form Feed
		 */
		
		System.out.println("Hellow prasad \n how r u");
		System.out.println("Hellow prasad \r how r u");
		System.out.println("Hellow prasad \t how r u");
		System.out.println("Hellow prasad \b how r u");
		System.out.println("Hellow prasad \f how r u");
		System.out.println("Hellow prasad how r u");

	}

}
