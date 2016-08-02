package org.libmots;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	private StringBuilder text;
	
	/* TEXT PROCESSING FUNCTIONS */
	
	/**
	 * Makes the text even, <i>i.e.</i> in the same case throughout
	 * This function doesn't use String.toLowerCase() for faster performance
	 */
	protected void toLowerCase() {
		char ch;
		
		for(int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			
			if (Character.isAlphabetic(ch)) {
				ch = Character.toLowerCase(ch);
				text.setCharAt(i, ch);
			}
		}
	}
	
	protected void removeArticles() {
		Matcher m = Pattern.compile(" +a +| +an +| +the +").matcher(text.toString());
		text = new StringBuilder(m.replaceAll(" "));
	}
	
	protected void removePunctuations() {
		Matcher m = Pattern.compile("[,/!<>\\?;':\\\"(.){}\\[\\]]").matcher(text.toString());
		text = new StringBuilder(m.replaceAll(""));
	}

	public Text(String text) {
		this.text = new StringBuilder(text);
	}
	
	public Text(StringBuilder text) {
		this.text = text;
	}

	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}
	
	public void processText() {
		toLowerCase();
		removePunctuations();
		removeArticles();
	}
}
