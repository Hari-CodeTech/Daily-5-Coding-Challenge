package Practice_2DArrays;
import java.util.*;
public class Create3_3Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		
		System.out.println("Enter elements for 3*3 matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Element at ["+i+"]["+j+"]:");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("/nYour 3*3 Matrox is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}

	}

}
