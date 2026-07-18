package Practice_2DArrays;
import java.util.*;
public class JaggredArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[4][];
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		arr[3]=new int[5];
		int j=0;
		System.out.println("Enter the Data:");
		for(int i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.println("Element at ["+i+"]["+j+"]:");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for( j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			int s=1;
			s+=i;
			System.out.println(" This is marks --> "+"Students " +s +" "+"Has"+j+"Subjects");
			System.out.println(" ");
		}

	}

}
