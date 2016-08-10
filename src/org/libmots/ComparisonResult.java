package org.libmots;

/**
 * This class encapsulates the result of a comparisen
 * @author Ved Khandekar
 */
public class ComparisonResult {
	private int matches;
	private int wordsInA, wordsInB;

	public ComparisonResult(int matches, int wordsInA, int wordsInB) {
		this.matches = matches;
		this.wordsInA = wordsInA;
		this.wordsInB = wordsInB;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getWordsInA() {
		return wordsInA;
	}

	public void setWordsInA(int wordsInA) {
		this.wordsInA = wordsInA;
	}

	public int getWordsInB() {
		return wordsInB;
	}

	public void setWordsInB(int wordsInB) {
		this.wordsInB = wordsInB;
	}
	
	/**
	 * This function compares <b><i>B</i></b> to <b><i>A</i></b>
	 * @return the similarity of <b><i>B</i></b> to <b><i>A</i></b> in percentage 
	 */
	public float compareAToB() {
		return (matches / (float) wordsInA) * 100;
	}
	
	/**
	 * This function compares <b><i>B</i></b> to <b><i>A</i></b>
	 * @return the similarity of <b><i>A</i></b> <i>w.r.t.</i> <b><i>B</i></b> in percentage 
	 */
	public float compareBToA() {
		return (matches / (float) wordsInB) * 100;
	}

	@Override
	public String toString() {
		return "ComparisonResult [matches=" + matches + ", wordsInA=" + wordsInA + ", wordsInB=" + wordsInB + "]";
	}
	
	
}
