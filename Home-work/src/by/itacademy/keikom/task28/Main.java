package by.itacademy.keikom.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		
		List <Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new Random().nextInt(10) + 1);
		}
		
		System.out.println("Исходный список оценок: \n" + list);
		
		int maxMark = list.get(0);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			int i = (int) iterator.next();
			if (i > maxMark) {
				maxMark = i;
			}
		}
		System.out.println("Максимальная оценка в списке: " + maxMark);
	}
}
