package by.itacademy.keikom.task6;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int day;
		int month;
		int year;
		
		do {
			System.out.print("Input day: ");
			day = sc.nextInt();
			System.out.print("Input month: ");
			month = sc.nextInt();
			System.out.print("Input year: ");
			year = sc.nextInt();
			
			if (inputValidation(day, month) == false) {
				System.out.println("Error input, repeat please\n");
			}
		}
		while(inputValidation(day,month) == false);
		
		System.out.println("\nTomorrow: ");
		dateNextDay(day, month, year);
	}
	
	public static void dateNextDay(int day,int month,int year) {
		
		if (month == 1 && day == 31) {
			month ++;
			day = 1;
		}
		else if (month == 2 && day == 28) {
			month ++;
			day = 1;
		}
		else if (month == 3 && day == 31) {
			month ++;
			day = 1;
		}
		else if (month == 4 && day == 30) {
			month ++;
			day = 1;
		}
		else if (month == 5 && day == 31) {
			month ++;
			day = 1;
		}
		else if (month == 6 && day == 30) {
			month ++;
			day = 1;
		}
		else if (month == 7 && day == 31) {
			month ++;
			day = 1;
		}
		else if (month == 8 && day == 31) {
			month ++;
			day = 1;
		}
		else if (month == 9 && day == 30) {
			month ++;
			day = 1;
		}
		else if (month == 10 && day == 31) {
			month ++;
			day = 1;
		}
		else if (month == 11 && day == 30) {
			month ++;
			day = 1;
		}
		else if (month == 12 && day == 31) {
			year ++;
			month = 1;
			day = 1;
		}
		else {
			day ++;
		}
		
		if (day < 10 && month < 10) {
			System.out.println("0" + day + "." + "0" + month + "." + year);
		} else 	if (day < 10) {
			System.out.println("0" + day + "." + month + "." + year);
		} 
		else if (month < 10) {
			System.out.println(day + "." + "0" + month + "." + year);
		} else 
			System.out.println(day + "." + month + "." + year);
	}
	
	public static Boolean inputValidation(int day,int month) {
		
		if (month < 1 || month >12) {
			return false;
		}
		
		if (month == 1 && day > 0 && day < 32) {
			return true;
		}
		
		if (month == 2 && day > 0 && day < 29) {
			return true;
		}
		
		if (month == 3 && day > 0 && day < 32) {
			return true;
		}
		
		if (month == 4 && day > 0 && day < 31) {
			return true;
		}
		
		if (month == 5 && day > 0 && day < 32) {
			return true;
		}
		
		if (month == 6 && day > 0 && day < 31) {
			return true;
		}
		
		if (month == 7 && day > 0 && day < 32) {
			return true;
		}
		
		if (month == 8 && day > 0 && day < 32) {
			return true;
		}
		
		if (month == 9 && day > 0 && day < 31) {
			return true;
		}
		
		if (month == 10 && day > 0 && day < 32) {
			return true;
		}
		
		if (month == 11 && day > 0 && day < 31) {
			return true;
		}
		
		if (month == 12 && day > 0 && day < 32) {
			return true;
		}
		return false;
	}
}
