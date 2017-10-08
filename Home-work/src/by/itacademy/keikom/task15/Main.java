package by.itacademy.keikom.task15;
import java.util.*;

public class Main {

	public static void main(String args[]) {
	
		Random random = new Random();
		
		int arr[] = new int[10];
		int summa = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(20) + 1;
		}
		
		int maxValue = arr[0];
		int minValue = arr[0];
		int indexMaxValue = 0;
		int indexMinValue = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] > maxValue) {
				maxValue = arr[i];
				indexMaxValue = i;
			}
			
			if (arr[i] < minValue) {
				minValue = arr[i];
				indexMinValue = i;
			}
		}
		
		System.out.println("Исходный массив: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nСумма элементов массива от min-го [" + minValue + "]" + " до max-го [" + maxValue + "]: ");
		
		int i;
		if (indexMinValue < indexMaxValue) {
			i = indexMinValue;
		}
		else {
			i = indexMaxValue;
			indexMaxValue = indexMinValue;
		}
			for(; i <= indexMaxValue; i++) {
				if(i != indexMaxValue) {
					System.out.print(arr[i] + " + ");
				}
				else {
					System.out.print(arr[i] + " = ");
				}
				summa += arr[i];
			}
			System.out.println(summa);
	}
}
