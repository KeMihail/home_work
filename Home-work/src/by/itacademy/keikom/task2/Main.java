package by.itacademy.keikom.task2;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите промежуток времени (количевство секунд): ");
		int s = sc.nextInt();
		
		int sec = s % 60;
		
		int m = (s - sec) / 60;
		int min = m % 60;
		
		int h = (m - min) / 60;
		int hour = h % 24;
		
		int d = (h - hour) / 24; 
		int day = d % 7;
		
		int week = (d - day) / 7;
		
		System.out.println(String.format(week + " недель, " + day + " дней, " + hour + " часов,"
		+ min + " минут, " + sec + " секунд"));
		
	}

}
