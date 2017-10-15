package by.itacademy.keikom.task26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		List<Integer> mark = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			mark.add(new Random().nextInt(5) + 1);
		}
		
		System.out.println("Исходный список оценок: ");
		System.out.println(mark);
		System.out.println("\nСписок без плохих оценок: ");
		
		for(int i = 0; i < mark.size(); i++) {
			if (mark.get(i) < 3) {
				mark.remove(i);
				i--;
			}
		}
		System.out.println(mark);
	}
}
