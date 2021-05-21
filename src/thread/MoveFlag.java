package thread;
import model.*;
import ui.*;

public class MoveFlag extends Thread{
	
	private Flag fl;
	private MoveFlagUI mf;
	private long sleep;
	
	public MoveFlag (Flag fl, MoveFlagUI moveFlagUI, long sleep) {
		this.fl = fl;
		this.mf = moveFlagUI;
		this.sleep = sleep;
	}
	
	@Override
	public void run () {
		newPVer();
		System.out.print("\u001b[0m");
	}
	
	public void newPVer() {
		for(int i = 0; i<fl.getWidth(); i++) {
			fl.pHor();
			for(int j = fl.getPos(); j<fl.getHeight(); j++) {
				mf.showFlag(fl.getHor(), fl.getVer(), fl.getMsg());
				fl.pVer();
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
				}
			}
			fl.setVerinPos();
		}
	}
}
