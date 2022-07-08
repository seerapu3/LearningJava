package arrays;

public class ThreeDArrays {

	public static void main(String[] args) {
		
		int[][][] EmployeesNum3D = new int[2][3][4];
		
		// 
		EmployeesNum3D[0][0][0] = 1;
		EmployeesNum3D[0][0][1] = 2;
		EmployeesNum3D[0][0][2] = 3;
		EmployeesNum3D[0][0][3] = 4;
		
		EmployeesNum3D[0][1][0] = 5;
		EmployeesNum3D[0][1][1] = 6;
		EmployeesNum3D[0][1][2] = 7;
		EmployeesNum3D[0][1][3] = 8;
		
		EmployeesNum3D[0][2][0] = 9;
		EmployeesNum3D[0][2][1] = 10;
		EmployeesNum3D[0][2][2] = 11;
		EmployeesNum3D[0][2][3] = 12;
		
		EmployeesNum3D[1][0][0] = 11;
		EmployeesNum3D[1][0][1] = 21;
		EmployeesNum3D[1][0][2] = 31;
		EmployeesNum3D[1][0][3] = 41;
		
		EmployeesNum3D[1][1][0] = 51;
		EmployeesNum3D[1][1][1] = 61;
		EmployeesNum3D[1][1][2] = 71;
		EmployeesNum3D[1][1][3] = 81;
		
		EmployeesNum3D[1][2][0] = 91;
		EmployeesNum3D[1][2][1] = 101;
		EmployeesNum3D[1][2][2] = 111;
		EmployeesNum3D[1][2][3] = 121;
		
		
		for(int index = 0; index < EmployeesNum3D.length; index++)
		{
			for(int row = 0; row < EmployeesNum3D[index].length; row++)
			{
				
				for(int firstrowvalues = 0; firstrowvalues < EmployeesNum3D[index][row].length; firstrowvalues++)
				{
					EmployeesNum3D[index][row][firstrowvalues] = (int) (Math.random()*50);
					System.out.print(EmployeesNum3D[index][row][firstrowvalues]+" ");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		
	}
	
}
