package by.itacademy.keikom.task11;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		System.out.print("Введите число: ");
		int number = sc.nextInt();
		
		for (int i = (number - 1); i > 1; i--) {
			
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println(String.format("Число %s является простым", number));
		}
		else {
			System.out.println(String.format("Число %s не есть простое", number));
		}
	}

}
