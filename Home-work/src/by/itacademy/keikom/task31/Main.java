package by.itacademy.keikom.task31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String args[])  {
		
		File dir = new File("D:\\Tasks\\Task31");
		dir.mkdirs();
		File file = new File(dir,"task31.txt");
		
		if (! file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		try (FileWriter fw = new FileWriter(file);){
			
			fw.write("Например, можно отформатировать ячейки, содержащие числа 15, 100 и 200,");
			fw.write(" таким образом, что на листе они будут отображаться как ");
			fw.write("Продукт № 15, Продукт № 100 и Продукт № 200.");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String str;
		StringBuilder strBl = new StringBuilder();
		try (FileReader fr = new FileReader(file);) {
			
			BufferedReader br = new BufferedReader(fr);
			while((str = br.readLine()) != null) {
				strBl.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Integer summa = 0;
		List <Integer> list = new ArrayList<Integer>();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(strBl);
		
		while(m.find()) {
			list.add(Integer.parseInt(m.group()));
			summa += Integer.parseInt(m.group());
		}
		
		System.out.println("Все числа из файла: " + list);
		System.out.println("Сумма чисел: " + summa);
		
		Set <Integer> list1 = new HashSet<Integer>(list);
		System.out.println("Числа без повторений: " + list1);
		
	}
}
