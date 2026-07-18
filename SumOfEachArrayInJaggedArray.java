package Practice_2DArrays;

public class SumOfEachArrayInJaggedArray {

	public static void main(String[] args) {
		int arr[][]={{10,20},{30,40,50},{60},{70,80,90,100}};
		int sum=0;
		int rowsum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				rowsum+=arr[i][j];
				sum+=arr[i][j];
			}
			System.out.println(" ");
			System.out.println("Sum of Each Row : " +rowsum);
			rowsum-=rowsum;
		}
		System.out.println("Total Sum of all elements : " + sum);
		
	}

}
