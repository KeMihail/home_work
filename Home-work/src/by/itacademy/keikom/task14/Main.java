package by.itacademy.keikom.task14;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Random random = new Random();
		int arr [] = new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
		}
		
		int maxMark = arr[0];
		int indexMaxMark = 0;
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > maxMark) {
				maxMark = arr[i];
				indexMaxMark = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nМаксимальная оценка расположена на " + (indexMaxMark + 1) + " месте");
	}
}
