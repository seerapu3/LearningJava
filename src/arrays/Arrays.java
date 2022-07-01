package arrays;

public class Arrays {

	public static void main(String[] args) {

		// Method 1
		int[] arrayList = new int[10];
		arrayList[0] = 10;
		arrayList[2] = 12;
		arrayList[4] = 102;
		arrayList[5] = 15;
		arrayList[6] = 156;

		for(int i= 0; i < arrayList.length; i++)
		{
			System.out.println(arrayList[i]);
		}

		// Method 1
		int[] arrayList2 = new int[10];;
		arrayList2[0] = 10;
		arrayList2[2] = 12;
		arrayList2[4] = 102;
		arrayList2[5] = 15;
		arrayList2[6] = 156;

		for(int i= 0; i < arrayList.length; i++)
		{
			System.out.println(arrayList[i]);
		}
		
		String[] cars =  {"Volvo", "BMW", "Ford", "Mazda"};
		int[] myNum = {10, 20, 30, 40};
		System.out.println(cars[0]);
		cars[0] = "Opel";
		System.out.println(cars[0]);

	}

}
