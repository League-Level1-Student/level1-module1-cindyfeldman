
public class Smurfs {

public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	Smurf papa = new Smurf("papa");
	Smurf smurfette = new Smurf("Smurfette");
	Handy.eat();
	Handy.getName();
	System.out.println(papa.getName());
	
	System.out.println(papa.isGirlOrBoy());
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
}
}