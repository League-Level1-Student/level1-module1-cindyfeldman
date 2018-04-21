public class SeaCreatureRunner{
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		System.out.println(Spongebob.getName());
		Spongebob.laugh();
		Spongebob.eat();
	SeaCreature Squidward = new SeaCreature("Squidward");
	SeaCreature Patrick = new SeaCreature("patrick");
	System.out.println(Squidward.getName());
	System.out.println(Patrick.getName());
	Squidward.eat();
	Patrick.eat();
	Squidward.laugh();
	Patrick.laugh();
}
}


