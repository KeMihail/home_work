package by.itacademy.keikom.task19;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите строку: ");
		String str = sc.nextLine();
		
		CountingNumberOfWords obj = new CountingNumberOfWords();
		
		System.out.println("В введенгой строке " + obj.countWord(str) + " слов.");
	}
}
