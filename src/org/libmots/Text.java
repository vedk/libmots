package org.libmots;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	private StringBuilder text;
	
	/* --------------------- TEXT PROCESSING FUNCTIONS --------------------- */
	
	/**
	 * Removes extra spaces
	 */
	protected void trimSpaces() {
		Matcher m = Pattern.compile(" +").matcher(text.toString());
		text = new StringBuilder(m.replaceAll(" "));
	}
	
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
	
	/**
	 * Removes the articles for the given text
	 */
	protected void removeArticles() {
		Matcher m = Pattern.compile(" *a +| *an +| *the +").matcher(text.toString());
		text = new StringBuilder(m.replaceAll(" "));
	}
	
	/**
	 * Removes all the punctuations including the three 
	 * types of brackets, the '()', '{}' and '[]'
	 */
	protected void removePunctuations() {
		Matcher m = Pattern.compile("[,/!<>\\?;':\\\"(.){}\\[\\]]").matcher(text.toString());
		text = new StringBuilder(m.replaceAll(""));
	}
	
	/* ------------------ END OF TEXT PROCESSING FUNCTIONS ----------------- */

	public Text(String text) {
		this.text = new StringBuilder(text);
		processText();
	}
	
	public Text(StringBuilder text) {
		this.text = text;
		processText();
	}

	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
		processText();
	}
	
	protected void processText() {
		toLowerCase();
		removePunctuations();
		removeArticles();
		trimSpaces();
	}
}
