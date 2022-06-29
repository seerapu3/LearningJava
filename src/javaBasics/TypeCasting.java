package javaBasics;

public class TypeCasting {
	public static void main(String[] args) {
		
	
	/*
	// Widening Casting
	int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    */
	
		//Narrowing Casting
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int
	    
	    System.out.println(myInt);
	    System.out.println(myDouble);
	}

}
