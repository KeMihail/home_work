package by.itacademy.keikom.task2;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ Ð¿Ñ€Ð¾Ð¼ÐµÐ¶ÑƒÑ‚Ð¾Ðº Ð²Ñ€ÐµÐ¼ÐµÐ½Ð¸ (Ð² Ñ�ÐµÐºÑƒÐ½Ð´Ð°Ñ…): ");
		int s = sc.nextInt();
		
		int sec = s % 60;
		
		int m = (s - sec) / 60;
		int min = m % 60;
		
		int h = (m - min) / 60;
		int hour = h % 24;
		
		int d = (h - hour) / 24; 
		int day = d % 7;
		
		int week = (d - day) / 7;
		
		System.out.println(String.format(week + " Ð½ÐµÐ´ÐµÐ»ÑŒ, " + day + " Ñ�ÑƒÑ‚Ð¾Ðº, " + hour + " Ñ‡Ð°Ñ�Ð¾Ð²," + min + " Ð¼Ð¸Ð½ÑƒÑ‚, " + sec + " Ñ�ÐµÐºÑƒÐ½Ð´"));
		
	}

}
