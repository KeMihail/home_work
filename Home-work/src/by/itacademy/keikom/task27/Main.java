package by.itacademy.keikom.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String args[]) {
		
		ArrayList  list = new ArrayList();
		
		for (int i = 0; i < 20; i++) {
			list.add(new Random().nextInt(10) + 1);
		}
		System.out.println(list);
		
		Set list1 = new HashSet(list);
		System.out.println(list1);
	}
}
