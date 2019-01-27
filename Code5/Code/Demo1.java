class Animal{
	 protected void eat() {
		System.out.println("Can eat anything..");
	}
}
class MeatEaterAnimal extends Animal{
	@Override
	public void eat() {
		System.out.println("Eat Meat");
	}
}
class Lion extends MeatEaterAnimal{
	@Override
	public void eat() {
		System.out.println("Fresh  Meat Eat");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
