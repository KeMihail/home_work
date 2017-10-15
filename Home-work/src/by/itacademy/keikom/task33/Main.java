package by.itacademy.keikom.task33;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		
		File [] fList;
		File F = new File ("C:\\Windows");
		fList = F.listFiles();
		
		List<String> listFile = new ArrayList<String>();
		List<String> listDirectory = new ArrayList<String>();
		
		for (int i = 0; i < fList.length; i++) {
			if (fList[i].isFile()) listFile.add(String.valueOf(fList[i]));
			if (fList[i].isDirectory()) listDirectory.add(String.valueOf(fList[i]));
		}
		
		System.out.println("Список каталогов: " + listDirectory);
		System.out.println("Список файлов: " + listFile);
	}

}
