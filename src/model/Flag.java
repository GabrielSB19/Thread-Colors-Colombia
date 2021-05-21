package model;

public class Flag {

	private String msg;
	private int pos;
	private int hor;
	private int ver;
	private int width;
	private int height;
	
	public Flag(String msg, int pos, int hor, int ver, int width, int height) {
		this.msg = msg;
		this.pos = pos;
		this.hor = hor;
		this.ver = ver;
		this.width = width;
		this.height = height;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void pHor() {
		hor++;
	}
	
	public void pVer() {
		ver++;
	}
	
	public void setVerinPos() {
		this.ver = pos;
	}
}
