package by.itacademy.keikom.task7;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("House number one: ");
		System.out.print("Input width: ");
		int houseOneWidth = sc.nextInt();
		System.out.print("Input height: ");
		int houseOneHeight = sc.nextInt();
		
		System.out.println("\nHouse number two: ");
		System.out.print("Input width: ");
		int houseTwoWidth = sc.nextInt();
		System.out.print("Input height: ");
		int houseTwoHeight = sc.nextInt();
		
		System.out.print("Input land width: ");
		int landWidth = sc.nextInt();
		System.out.print("Input land height: ");
		int landHeight = sc.nextInt();
		
		if (checkEmbed(houseOneWidth, houseOneHeight, houseTwoWidth, houseTwoHeight, landWidth, landHeight)) {
			System.out.println("Yes, two house location in land");
		}
		else {
			System.out.println("No, .... houses is big and land is small");
		}
		
	}
	
	public static Boolean checkEmbed(int houseOneWidth, int houseOneHeight, int houseTwoWidth, int houseTwoHeight, int landWidth, int landHeight) {
		
		boolean condition1 = (landWidth - houseOneWidth) >= houseTwoWidth;
		boolean condition2 = landHeight >= houseTwoHeight;
		boolean condition3 = landHeight >= houseOneHeight;
		
		if (condition1 && condition2 && condition3) {
			return true;
		}
		
		boolean condition4 = (landWidth - houseOneWidth) >= houseTwoHeight;
		boolean condition5 = landHeight >= houseTwoWidth;
		
		if (condition4 && condition5 && condition3) {
			return true;
		}
		
		boolean condition6 = landHeight >= houseOneWidth;
		boolean condition7 = (landWidth - houseOneHeight) >= houseTwoWidth;
		
		if (condition6 && condition7 && condition2) {
			return true;
		}
		
		boolean condition8 = (landWidth - houseOneHeight) >= houseTwoHeight;
		if(condition6 && condition8 && condition5) {
			return true;
		}
		
		boolean condition9 = landWidth >= houseOneWidth;
		boolean condition10 = (landHeight - houseOneHeight) >= houseTwoHeight;
		boolean condition11 = landWidth >= houseTwoWidth;
		if(condition9 && condition10 && condition11) {
			return true;
		}
		
		boolean condition12 = landWidth >= houseTwoHeight;
		boolean condition13 = (landHeight - houseOneHeight) >= houseTwoWidth;
		if(condition9 && condition12 && condition13) {
			return true;
		}
		
		boolean condition14 = landWidth >= houseOneHeight;
		boolean condition15 = (landHeight - houseOneWidth) >= houseTwoHeight;
		if(condition14 && condition11 && condition15) {
			return true;
		}
		
		boolean condition16 = (landHeight - houseOneWidth) >= houseTwoWidth;
		if(condition14 && condition12 && condition16) {
			return true;
		}
		return false;
	}
}
