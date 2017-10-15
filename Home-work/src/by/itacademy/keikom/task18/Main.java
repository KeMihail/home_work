package by.itacademy.keikom.task18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String str = sc.nextLine();
		int count = 0;
		char symbol;
		
		System.out.println("Вы ввели: " + str);
		
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ',') {
				count++;
			}
		}
		System.out.println("Количевство запятых в тексте: " + count);
		
		int p = 0;
		int count1 = 0;
		while(p != -1) {
			p = str.indexOf(',',p);
			if (p != -1) {
				count1++;
				p++;
			}
	}
		System.out.println("Количевство пробелов в введеном текте: " + count1);
		
		int count3 = new CountPunctuation().countsPunctuation(str);
		
		System.out.println("Количевство знаков препенания в введеном тексте: " + count3);
	}

}
