package by.itacademy.keikom.task16;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Random random = new Random();
		int arr[] = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(20) + 1;
		}
		
		System.out.println("Исходный массив: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < (arr.length / 2); i++) {
			int byf = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = byf;
		}
		
		System.out.println("\n\nПеревернутый массив: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
