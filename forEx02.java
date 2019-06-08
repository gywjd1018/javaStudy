package homework;

/*
	6	5	4
		3	2
			1
 */

public class forEx02 {

	public static void main(String[] args) {

		int [][] arr = new int[3][3];
		int num = 6;
		
		for (int i=0; i<3; i++) {
			for (int j=i; j<3; j++) {
				arr[i][j] = num;
				
				num--;
			}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<i; j++)
				System.out.print("\t");
			
			for (int j=i; j<3; j++) 
				System.out.print(arr[i][j] + "\t");
			
			System.out.println();
		}

	}

}
