package by.itacademy.keikom.task18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountPunctuation {

	String regez = "\\.|,|\\?|!|:|;|-";
	int count3 = 0;
	
	public Integer countsPunctuation(String str) {
		
		Pattern pattern = Pattern.compile(regez);
		Matcher matcher = pattern.matcher(str);
			while(matcher.find()) {
				count3++;
			}
			
		return count3;
	}
}
