package home;

import acm.graphics.GCompound;
import acm.graphics.GLine;

public class Tic extends GCompound {
	private GLine line1;
	private GLine line2;
	
	public Tic(int x) {
		line1 = new GLine(0,0,x,x);
		line2 = new GLine(0,x,x,0);
		add(line1);
		add(line2);
	}
}
