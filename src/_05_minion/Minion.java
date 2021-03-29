package _05_minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	Minion(String n, int e, String c, String m) {
		name = n;
		eyes = e;
		color = c;
		master = m;
	}

	String getName() {
		return name;
	}

	int getEyes() {
		return eyes;
	}
	
	String getColor() {
		return color;
	}
	
	String getMaster() {
		return master;
	}
	
	void setMaster(String m) {
		master = m;
	}
}
