package org.libmots;

public class TextComparator {
	
	/**
	 * This function compares the text content of two {@link Text} objects 
	 * @param t1 text A
	 * @param t2 text B
	 * @return a {@link ComparisonResult} object
	 */
	public static ComparisonResult compareTexts(Text t1, Text t2) {
		int matches = 0;
		
		String[] parts1 = t1.getText().toString().split(" ");
		String[] parts2 = t2.getText().toString().split(" ");
		
		for (String word1 : parts1) {
			for (String word2 : parts2) {
				if (word1.equals(word2)) {
					matches++;
				}
			}
		}
		
		return new ComparisonResult(matches, parts1.length, parts2.length);
	}
}
