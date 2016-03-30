package home;

import java.awt.Color;
import home.*;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.event.*;

public class TicTack extends GraphicsProgram {

	private static final int SIZE = 300;
	private boolean cell11 = true;
	private boolean cell12 = true;
	private boolean cell13 = true;
	private boolean cell21 = true;
	private boolean cell22 = true;
	private boolean cell23 = true;
	private boolean cell31 = true;
	private boolean cell32 = true;
	private boolean cell33 = true;
	private int count = 0;
	
	@Override
	public void init() {
		this.setSize(SIZE, SIZE);
		addMouseListeners();
	}
	
	public void run() {
		drawGrid();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(count<9) {
			if(e.getX()<SIZE/3) {
				if(e.getY()<SIZE/3 && cell11) {
					put(0, 0);
					cell11 = false;
				} else if(e.getY()<2*SIZE/3 && cell12) {
					put(0, SIZE/3);
					cell12 = false;
				} else {
					put(0, 2*SIZE/3);
					cell13 = false;
				}			
			} else if(e.getX()<2*SIZE/3) {
				if(e.getY()<SIZE/3 && cell21) {
					put(SIZE/3, 0);
					cell21 = false;
				} else if(e.getY()<2*SIZE/3 && cell22) {
					put(SIZE/3, SIZE/3);
					cell22 = false;
				} else {
					put(SIZE/3, 2*SIZE/3);
					cell23 = false;
				}			
			} else {
				if(e.getY()<SIZE/3 && cell31) {
					put(2*SIZE/3, 0);
					cell31 = false;
				} else if(e.getY()<2*SIZE/3 && cell32) {
					put(2*SIZE/3, SIZE/3);
					cell32 = false;
				} else {
					put(2*SIZE/3, 2* SIZE/3);
					cell33 = false;
				}			
			}
		}
		count++;
	}
	
	public void put(int x, int y) {
		if (count%2==0) {
			add(new Tic(SIZE/3), x, y);
		} else {
			add(new GOval(SIZE/3,SIZE/3), x, y);
		}
	}
	
	private void drawGrid() {
		add(new GRect(0, 0, SIZE-1, SIZE-1));
		add(new GLine(0, SIZE/3, SIZE, SIZE/3));
		add(new GLine(0, 2*SIZE/3, SIZE, 2*SIZE/3));
		add(new GLine(SIZE/3, 0, SIZE/3, SIZE));
		add(new GLine(2*SIZE/3, 0, 2*SIZE/3, SIZE));
	}

}
