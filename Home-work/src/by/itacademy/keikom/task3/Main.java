package by.itacademy.keikom.task3;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾: ");
		
		int number = sc.nextInt();
		int lastNumber = number % 10;
		
		if (lastNumber == 7) {
			System.out.println("Ð”Ð°, Ð¿Ð¾Ñ�Ð»ÐµÐ´Ð½Ñ�Ñ� Ñ†Ð¸Ñ„Ñ€Ð° Ñ‡Ð¸Ñ�Ð»Ð° 7 (Ñ�ÐµÐ¼ÑŒ).");
		}
		
		else {
			System.out.println("ÐŸÐ¾Ñ�Ð»ÐµÐ´Ð½Ñ�Ñ� Ñ†Ð¸Ñ„Ñ€Ð° Ñ‡Ð¸Ñ�Ð»Ð° Ð�Ð• ÐµÑ�Ñ‚ÑŒ 7 (Ñ�ÐµÐ¼ÑŒ).");
		}
	}

}
