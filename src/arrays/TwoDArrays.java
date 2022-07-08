package arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] EmployeesNum2D = new int[2][3];
		int[][][] EmployeesNum33 = new int[2][3][4];
		
		// 
		EmployeesNum2D[0][0] = 1;
		EmployeesNum2D[0][1] = 2;
		EmployeesNum2D[0][2] = 3;
		
		EmployeesNum2D[1][0] = 4;
		EmployeesNum2D[1][1] = 5;
		EmployeesNum2D[1][2] = 6;
		
		for(int row = 0; row < EmployeesNum2D.length; row++)
		{
			for(int rowValues = 0; rowValues < EmployeesNum2D[row].length; rowValues++)
			{
				EmployeesNum2D[row][rowValues] = (int) (Math.random()*50000);
				System.out.print(EmployeesNum2D[row][rowValues]+" ");
			}
			System.out.print("\n");
		}
		
		
	}
	
}
