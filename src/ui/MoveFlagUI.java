package ui;
import model.*;
import thread.MoveFlag;

public class MoveFlagUI {
	
	private final String ESC   = "\u001b[";
	private final String yellow = "\u001b[43m";
	private final String blue = "\u001b[44m";
	private final String red = "\u001b[41m";
	private final int sizeFlag = 3;
	
	private Flag[] af;
	private MoveFlag [] amf;
	
	public MoveFlagUI () {
		af = new Flag[sizeFlag];
		amf = new MoveFlag[sizeFlag];
		initFlag();
		initThread();
	}
	
	public void initP() {
		for(int i = 0; i<sizeFlag; i++) {
			amf[i].start();
		}
	}
	
	public void initFlag() {
		af[0] =  new Flag("y", 0, 0, 0, 120, 10);
		af[1] =  new Flag("b", 10, 0, 10, 120, 15);
		af[2] =  new Flag("r", 15, 0, 15, 120, 20);
	}
	
	public void initThread() {
		amf[0] = new MoveFlag(af[0], this, 13);
		amf[1] = new MoveFlag(af[1], this, 30);
		amf[2] = new MoveFlag(af[2], this, 35);
	}
	
	public void showFlag(int hor, int ver, String msg) {
		if(msg.equals("y")) {
			System.out.print(ESC+hor+"G"+ESC+ver+"d"+yellow+" "+ESC);
		} else if (msg.equals("b")) {
			System.out.print(ESC+hor+"G"+ESC+ver+"d"+blue+" "+ESC);
		} else {
			System.out.print(ESC+hor+"G"+ESC+ver+"d"+red+" "+ESC);
		}
	}
}
