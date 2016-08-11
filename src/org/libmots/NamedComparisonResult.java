package org.libmots;

public class NamedComparisonResult extends ComparisonResult {
	private String fileA, fileB;

	public NamedComparisonResult(int matches, int wordsInA, int wordsInB, String fileA, String fileB) {
		super(matches, wordsInA, wordsInB);
		
		this.fileA = fileA;
		this.fileB = fileB;
	}
	
	public NamedComparisonResult(ComparisonResult c, String fileA, String fileB) {
		super(c);
		
		this.fileA = fileA;
		this.fileB = fileB;
	}

	public String getFileA() {
		return fileA;
	}

	public void setFileA(String fileA) {
		this.fileA = fileA;
	}

	public String getFileB() {
		return fileB;
	}

	public void setFileB(String fileB) {
		this.fileB = fileB;
	}
}
