package by.itacademy.keikom.task29;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) {
		
		String str = "Набор является является данных HashMap является альтернативой Hashtable."
				+ " Основными отличиями от Hashtable являются то, "
				+ "что HashMap не синхронизирован и позволяет использовать null как в качестве ключа, так и значения.";
		
		Map <String,Integer> list = new HashMap<String,Integer>();
		
		String [] array = str.split(" ");
		
		for (String i : array) {
			
			Integer frequency = list.get(i);
			list.put(i, frequency == null ?  1 : frequency + 1);
		}
		System.out.println(list);
	}
}
