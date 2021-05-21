package ui;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		String ESC   = "\u001b[";
		System.out.print(ESC+"2J");
		
		MoveFlagUI mfui = new MoveFlagUI();
		mfui.initP();
	}
}