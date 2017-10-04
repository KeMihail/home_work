package by.ItAcademy.Keiko.Task3;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		
		int number = sc.nextInt();
		int lastNumber = number % 10;
		
		if (lastNumber == 7) {
			System.out.println("Да, последняя цифра числа 7 (семь).");
		}
		
		else {
			System.out.println("Последняя цифра числа НЕ есть 7 (семь).");
		}
	}

}
