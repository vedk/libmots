package org.libmots;

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
		//TODO: use regex and remove the articles
	}
	
	protected void removePunctuations() {
		//XXX: try to use regex
		char ch;
		
		for(int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			
			if (ch == '.' || ch == ',' || ch == '?' || 
					ch == '/' || ch == '\'' || ch == ';' ||
					ch == ':' || ch == '\"' || ch == '-' ||
					ch == '!') {
				text.setCharAt(i, ' ');
			}
		}
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
	}
}
