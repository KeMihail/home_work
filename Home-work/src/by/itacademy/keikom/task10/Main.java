package by.itacademy.keikom.task10;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int summa = 0;
		
		System.out.print("Введите число: ");
		int number = sc.nextInt();
		
		System.out.println("\nСумма цифр числа " + number + ": ");
		while(number > 0) {
			
			summa += number % 10;
			if (number / 10 > 0) {
				System.out.print(number % 10 + " + ");
			}
			else {
				System.out.print(number % 10 + " ");
			}
			number /= 10;
		}
		System.out.println(" = " + summa);
	}
}
