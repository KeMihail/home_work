package by.itacademy.keikom.task20;

import java.util.Arrays;
import java.util.Scanner;

import by.itacademy.keikom.task19.CountingNumberOfWords;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String str = sc.nextLine();
		
		Integer countWords = new CountingNumberOfWords().countWord(str);
		char [] word = new char[countWords];
		
		String [] words = str.split(" ");
		
		for (int i = 0; i < words.length; i++)
			word[i] = words[i].charAt(words[i].length()-1);
		
		String str1 = new String(word);
		System.out.println("Слово из последних букв: " + str1);
	}

}
