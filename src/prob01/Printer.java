package prob01;

public class Printer {
	
	private int inum;
	private boolean bool;
	private double dnum;
	private String str;
	
	public int getInum() {
		return inum;
	}
	public void setInum(int inum) {
		this.inum = inum;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

	public void println (int inum) {
		System.out.println(inum);
	}
	public void println (boolean bool) {
		System.out.println(bool);
	}
	public void println (double dnum) {
		System.out.println(dnum);
	}
	public void println (String str) {
		System.out.println(str);
	}
}
