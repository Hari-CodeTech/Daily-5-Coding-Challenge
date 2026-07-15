package Continue_Break_Statement;
import java.util.*;
public class First_Even_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean found=false;
		
			for( int i=0;i<10;i++) {
				int n=sc.nextInt();
			
				if(n%2==0) { 
				System.out.println(n);
				found=true;
				break;
			}
			
			}
			if(!found){
				System.out.println("No Even Number FOund:");
			}
			
	}

}