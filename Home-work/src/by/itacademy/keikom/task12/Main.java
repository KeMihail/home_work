package by.itacademy.keikom.task12;
import java.util.*;

public class Main {

		
		public static void main(String args[]) {
			
			Scanner sc = new Scanner (System.in);
			int j = 0;
			
			System.out.print("Введите число: ");
			Integer number = sc.nextInt();
			
			String numberToString = number.toString();
			
			char[] charArray = numberToString.toCharArray();
			if (charArray.length % 3 == 1) 	j = 2;
			if (charArray.length % 3 == 2) j = 1;
			
			System.out.println(String.format("\nЧисло %s в бухгалтерском формате: ", number));
			for (int i = 0; i < charArray.length; i++) {
				
				if ((j%3 == 0) && j != 0) System.out.print(" ");
				System.out.print(charArray[i]);
				j++;
			}
			
		}
}
