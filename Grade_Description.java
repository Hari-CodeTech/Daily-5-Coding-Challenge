package SwitchPrograms;
import java.util.*;
public class Grade_Description {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String Grade=sc.next();
		char Grade = sc.next().charAt(0);
		
		switch(Grade) {
		case 'A':System.out.println("Excellent");
			break;
		case 'B':System.out.println("Very Good");
			break;
		case 'c':System.out.println("Good");
			break;
		case 'D':System.out.println("Needs Improvement");
			break;
		case 'F':System.out.println("Failed");
			break;
			default:System.out.println("Invalid Grade");
		}

	}

}
