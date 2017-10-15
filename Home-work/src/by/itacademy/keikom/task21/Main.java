package by.itacademy.keikom.task21;

import java.util.Date;

public class Main {

	public static void main(String args[]) {
		
		String str = "Hello";
		long timeStringEnd = 0;
		long timeStringStart = 0;
		for (int i = 0; i <= 10000; i++) {
			
			if (i == 0) timeStringStart = new Date().getTime();
			if (i == 10000)  timeStringEnd = new Date().getTime();
			str += i;
			
		}
		
		System.out.println("String: strart: " + timeStringStart + ", end: " + timeStringEnd + 
				". Run time: " + (timeStringEnd - timeStringStart));
		
		StringBuilder strBl = new StringBuilder("Hello");
		long timeStrBlStart = 0;
		long timeStrBlEnd = 0;
		
		for(int i = 0; i <= 10000; i++) {
			
			if (i == 0) timeStrBlStart = new Date().getTime();
			if (i == 10000) timeStrBlEnd = new Date().getTime();
			strBl.append(i);
			
		}
		
		System.out.println("StringBuilder: start: " + timeStrBlStart + ", end: " + timeStrBlEnd + 
				". Run time: " + (timeStrBlEnd - timeStrBlStart));
	}
}
