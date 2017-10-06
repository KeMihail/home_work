package by.itacademy.keikom.task4;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ Ñ�Ñ‚Ð¾Ñ€Ð¾Ð½Ñƒ Ð°: ");
		double sideA = sc.nextDouble();

		System.out.print("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ Ñ�Ñ‚Ð¾Ñ€Ð¾Ð½Ñƒ b: ");
		double sideB = sc.nextDouble();
		
		System.out.print("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ Ñ€Ð°Ð´Ð¸Ñƒ r: ");
		double radiusR = sc.nextDouble();
		
		double sideC = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB, sideB));
		
		if (sideC < radiusR * 2) {
			System.out.println(String.format("ÐšÑ€ÑƒÐ³Ð»Ð°Ñ� ÐºÐ°Ñ€Ñ‚Ð¾Ð½ÐºÐ° Ñ� Ñ€Ð°Ð´Ð¸ÑƒÑ�Ð¾Ð¼: %s \n"
					+ "Ð¿Ð¾Ð»Ð½Ð¾Ñ�Ñ‚ÑŒÑŽ Ð·Ð°ÐºÑ€Ñ‹Ð²Ð°ÐµÑ‚ Ð¾Ñ‚Ð²ÐµÑ€Ñ�Ñ‚Ð¸Ðµ Ñ�Ð¾ Ñ�Ñ‚Ð¾Ñ€Ð¾Ð½Ð°Ð¼Ð¸: %s; %s",radiusR,sideA,sideB));
		}  
		else {
			System.out.println(String.format("ÐšÑ€ÑƒÐ³Ð»Ð°Ñ� ÐºÐ°Ñ€Ñ‚Ð¾Ð½ÐºÐ° Ñ� Ñ€Ð°Ð´Ð¸ÑƒÑ�Ð¾Ð¼ %s" +
		" \nÐ½Ðµ Ð·Ð°ÐºÑ€Ñ‹Ð²Ð°ÐµÑ‚ Ð¿Ñ€Ñ�Ð¼Ð¾ÑƒÐ³Ð¾Ð»ÑŒÐ½Ð¾Ðµ Ð¾Ñ‚Ð²ÐµÑ€Ñ�Ñ‚Ð¸Ðµ Ñ�Ð¾ Ñ�Ñ‚Ð¾Ñ€Ð¾Ð½Ð°Ð¼Ð¸ a:%s; b:%s", radiusR,sideA,sideB));
		}
	}
}
