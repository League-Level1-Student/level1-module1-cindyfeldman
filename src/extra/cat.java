package extra;

public class cat {
	int numberofToys;
	String FavoriteFood;
public static void main(String[] args) {
	cat fluffy = new cat("tuna",5);
	System.out.println(fluffy.FavoriteFood);
}
void meow() {
	
}
void sleep() {
	
}
cat(String FavoriteFood, int numberofToys){
	this.FavoriteFood = FavoriteFood;
	this.numberofToys = numberofToys;
}
}