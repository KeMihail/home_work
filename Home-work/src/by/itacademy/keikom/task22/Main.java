package by.itacademy.keikom.task22;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		TimePeriod [] arr = new TimePeriod[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = new TimePeriod(new Random().nextInt(50000) + 1);
		}
		
		System.out.println("Исходный массив периодов времени: ");
		showTimePeriods(arr);
		
		Arrays.sort(arr);
		System.out.println("\nОтсортированный массив временных периодов: ");
		showTimePeriods(arr);
	}

	private static void showTimePeriods(TimePeriod[] arr) {
		for (TimePeriod i : arr) {
			System.out.println(i);
		}
	}
}
