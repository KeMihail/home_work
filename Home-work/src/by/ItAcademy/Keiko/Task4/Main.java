package by.ItAcademy.Keiko.Task4;
import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите сторону а: ");
		double sideA = sc.nextDouble();

		System.out.print("Введите сторону b: ");
		double sideB = sc.nextDouble();
		
		System.out.print("Введите радиу r: ");
		double radiusR = sc.nextDouble();
		
		double sideC = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB, sideB));
		
		if (sideC < radiusR * 2) {
			System.out.println(String.format("Круглая картонка с радиусом: %s \n"
					+ "полностью закрывает отверстие со сторонами: %s; %s",radiusR,sideA,sideB));
		}  
		else {
			System.out.println(String.format("Круглая картонка с радиусом %s" +
		" \nне закрывает прямоугольное отверстие со сторонами a:%s; b:%s", radiusR,sideA,sideB));
		}
	}
}
