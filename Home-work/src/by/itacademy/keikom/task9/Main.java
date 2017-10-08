package by.itacademy.keikom.task9;

import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		Random random = new Random();
		
		int numberMax = 0;
		int number = random.nextInt(20);
		
		while (number != 0) {
			
			System.out.print(number + " ");
			if (number > numberMax) {
				numberMax = number;
				number = random.nextInt(20);
			}
			number = random.nextInt(20);
		}
		
		if (numberMax != 0) {
			System.out.println("\nМаксимальное число последовательности: " + numberMax);
		}
		else {
			System.out.println("\nПоследовательномть чисел не сформировалась !!!");
		}
	}
}
