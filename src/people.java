
public class people {
public static void main(String[] args) {
	Person cindy = new Person();
	Person Eve = new Person();
	Person Ricky = new Person();
	cindy.setName("cindy");
	cindy.setSuperpower("invisability");
	Ricky.setSuperpower("speed");
	Eve.setSuperpower("mind reading");
	System.out.println(Eve.getSuperpower());
	System.out.println(Ricky.getSuperpower());
System.out.println(cindy.getNameandPower());
}
}