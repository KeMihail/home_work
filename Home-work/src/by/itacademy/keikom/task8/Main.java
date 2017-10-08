package by.itacademy.keikom.task8;

public class Main {

	public static void main(String args[]) {
		
		int s = 50;
		int i = 0;
		int j = 1;
		int factorial = 1;
		
		do {
			
			s = s -4;
			i++;
			j = i;
			factorial = 1;
			while(j > 0) {
				factorial *= j; 
				j--;
			}
		}
		while(i < 4 && i > 0);
		
		System.out.println("s = " + s + ", i = " + i + ", factorial (" + i + ") = " + factorial);
	}
}
