package _01_sea_creature;

public class CreatureRunner {
public static void main(String[] args) {
	SeaCreature s = new SeaCreature("spongebob");
	s.eat();
	s.laugh();
	SeaCreature p = new SeaCreature("patrick");
	System.out.println(p.getName());
	p.eat();
	p.laugh();
	SeaCreature sq = new SeaCreature("squidward");
	System.out.println(sq.getName());
	sq.eat();
	sq.laugh();
}
}
