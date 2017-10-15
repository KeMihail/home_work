package by.itacademy.keikom.task32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static void main(String args[]) {
		
		File dir = new File("D:\\Tasks\\task32");
		dir.mkdirs();
		File file = new File(dir,"task32.txt");
		
		if (! file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		try (FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream (fos);) {
			for (int i = 0; i < 20; i++) {
				dos.writeInt(new Random().nextInt(20) + 1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Integer number;
		Integer summa = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		try (FileInputStream fis = new FileInputStream(file);
				DataInputStream dis = new DataInputStream (fis)) {
				for (int i = 0; i < 20; i ++) {
					number = dis.readInt();
					list.add(number);
					summa += number;
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Числа из файла: " + list);
		System.out.println("Среднее фрифметическое: " + (summa / 20));
		
		Double srAr =  (double) (summa / 20);
		System.out.println("Среднее арифметическое (double): " + srAr);
	}

}
