package homework;

/*
			1
	  	3 	2
	6	5	4
 */

public class forEx01 {

	public static void main(String[] args) {

		int [][] arr = new int[3][3];
		int num = 1;
		
		for (int i=0; i<3; i++) {
			for (int j=i; j>=0; j--) {
				arr[i][j] = num;
				
				num++;
			}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=2; j>i; j--)
				System.out.print("\t");
			
			for (int j=0; j<=i; j++) 
				System.out.print(arr[i][j] + "\t");

			System.out.println();
		}
	}
}
