package by.itacademy.keikom.task17;

public class Main {

	public static void main(String args[]) {
		
		int arr[][] = new int [5][5];
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}
		
		int m = 0;
		int n = arr.length - 1;
		
		for (int i = 0; i < (arr.length / 2) + 1; i++) {
			for (int j = m; j <= n; j++ ) {
				arr[i][j] = 1;
			}
			m++;
			n--;
		}
		
		m = (arr.length / 2) - 1;
		n = arr.length - 1;
		for (int i = (arr.length - arr.length / 2); i < arr.length; i++) {
			for(int j = m; j < n; j++) {
				arr[i][j] = 1;
			}
			m--;
			n++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();	
		}
	}
}
