
public class Ducks {
String favFood;
int numberofFriends;
public static void main(String[] args) {
	Ducks daffy= new Ducks("donuts",5);
	daffy.quack();
}
void quack() {
	System.out.println("quack");
}
void waddle() {
	
}
Ducks(String favFood,int numberofFriends){
	this.favFood= favFood;
	this.numberofFriends= numberofFriends;
}}