package by.itacademy.keikom.task19;

public class CountingNumberOfWords {

	Integer i = 0;
	Integer j;
	Integer countWord = 0;
	
	public Integer countWord(String str) {
		Integer j;
		if (str.isEmpty()) return 0;
		
		while(i < str.length() && str.charAt(i) == ' ') {
				i++;
			}
		
		if (i == str.length()) return 0;
		
		if (i != 0) {
			j = i - 1;
		}
		else {
			i = 1;
			j = 0;
			countWord++;
		}
		for (; i < str.length(); i++) {
						
			if (str.charAt(j) == ' ' && str.charAt(i) != ' ') countWord++;
			j++;
		}
		return countWord;
	}
}
