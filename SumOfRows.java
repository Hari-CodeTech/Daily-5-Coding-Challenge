package Practice_2DArrays;
import java.util.*;
public class SumOfRows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][3];
		int	 rowsum=0;
	
		System.out.println("Element of  4*3 Matrix");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Elements at ["+i+"]["+j+"]:" );
				arr[i][j]=sc.nextInt();
			}
		}
		// Print like matrix with sum
		for(int i=0;i<4;i++) {
			for( int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
				rowsum+=arr[i][j];
				
			}
			System.out.println(" ");
			
			System.out.println("Row "+ i +" Sum = " +rowsum);
			rowsum=rowsum-rowsum;
		}

	}

}
