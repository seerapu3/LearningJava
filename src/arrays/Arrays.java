package arrays;

public class Arrays {

	public static void main(String[] args) {

		int[] listnumber = new int[10];
		System.out.println(listnumber.length);	

		listnumber[0] = 10;
		listnumber[1] = 1;
		listnumber[2] = 450;
		listnumber[3] = 156;
		listnumber[4] = 1045;
		System.out.println("This will print the address of the array"+listnumber);

		for(int index = 0; index < listnumber.length ; index++)
		{
			System.out.println(listnumber[index]);
		}

		// We can print the array values using for each 
		for(int value:listnumber)
		{
			System.out.println(value);
		}

		String[] name = new String[5];
		name[0]= "Prasad";
		name[1]= "Nikki";
		name[3]= "Lakki";
		name[4]= "Seerapu";
		name[2]= "Nirmala";

		for(int index = 0; index < name.length ; index++)
		{
			System.out.println(name[index]);
		}

		// We can print the array values using for each 
		for(String value:name)
		{
			System.out.println(value);
		}
		// Reverse order
		for(int index = name.length - 1; index >= 0 ; index--)
		{
			System.out.println(name[index]);
		}
	}

}
