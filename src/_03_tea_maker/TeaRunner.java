package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaRunner {
public static void main(String[] args) {
	
	TeaBag bag = new TeaBag("Peach");
	Kettle k = new Kettle();
	k.boil();
	Water w = k.getWater();
	
	
	Cup c = new Cup();
	c.makeTea(bag, w);
}
}
