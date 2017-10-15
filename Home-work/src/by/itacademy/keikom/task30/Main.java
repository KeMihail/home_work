package by.itacademy.keikom.task30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import by.itacademy.keikom.task18.CountPunctuation;
import by.itacademy.keikom.task19.CountingNumberOfWords;

public class Main {

	public static void main(String args[]) {
		
		File dir = new File("D:\\Tasks\\task30");
		dir.mkdirs();
		File file = new File(dir,"task30.txt");
		
		if (! file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		try (FileWriter fw = new FileWriter(file);) {
			fw.write("Класс File пакета java.io используется для управления информацией о файлах и каталогах.");
			fw.write("На уровне операционной системы файлы и каталоги имеют существенные отличия,");
			fw.write("но в Java они описываются одним классом File. Каталог в Java трактуется как обычный файл,");
			fw.write("но с дополнительным свойством — списком имен файлов, который можно просмотреть с помощью метода list.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str;
		StringBuilder strBl = new StringBuilder();
		try (FileReader fr = new FileReader(file);) {
			BufferedReader br = new BufferedReader(fr);
			while((str = br.readLine()) != null) {
				strBl.append(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int countWord = new CountingNumberOfWords().countWord(String.valueOf(strBl));
		System.out.println("Количевство слов в файле: " + countWord);
		
		int countPunctuation = new CountPunctuation().countsPunctuation(String.valueOf(strBl));
		System.out.println("Количевство знаков припенания в файле: " + countPunctuation);
		
	}
}
