package org.libmots;

import java.util.ArrayList;

public class BatchTextComparator {
	/*private ArrayList<Text> batch1, batch2;
	private ArrayList<NamedComparisonResult> results;

	public BatchTextComparator(ArrayList<Text> batch1, ArrayList<Text> batch2) {
		this.batch1 = batch1;
		this.batch2 = batch2;
	}
	
	public ArrayList<Text> getBatch1() {
		return batch1;
	}

	public void setBatch1(ArrayList<Text> batch1) {
		this.batch1 = batch1;
	}

	public ArrayList<Text> getBatch2() {
		return batch2;
	}

	public void setBatch2(ArrayList<Text> batch2) {
		this.batch2 = batch2;
	}*/
	
	public static ArrayList<NamedComparisonResult> batchCompareTexts(ArrayList<Text> b1, ArrayList<Text> b2) {
		ArrayList<NamedComparisonResult> res = new ArrayList<NamedComparisonResult>();
		
		for (Text t1 : b1) {
			for (Text t2 : b2) {
				res.add(new NamedComparisonResult(TextComparator.compareTexts(t1, t2), t1.getSource(), t2.getSource()));
			}
		}
		
		return res;
	}
}
