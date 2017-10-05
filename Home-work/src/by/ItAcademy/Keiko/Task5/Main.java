package by.ItAcademy.Keiko.Task5;

import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int number = sc.nextInt();
		int numberWork = number % 10;
		int numberException = number;
		
		boolean condition = (numberException %= 100) > 10;
		boolean condition1 = (numberException %= 100) < 15;
		boolean contition2 = numberWork > 4;
		boolean condition3 = numberWork < 11;
		boolean condition4 = (numberWork == 0);
		
		if (condition && condition1 || contition2 && condition3 || condition4) {
			System.out.println(number + " рублей");
			return;
		}
		
		if (numberWork  == 1) {
			System.out.println(number + " рубль");
			return;
		}
		
		if (numberWork > 1 && numberWork  < 5) {
			System.out.println(number + " рубля");
		}
	}
}
