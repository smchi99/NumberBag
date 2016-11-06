
public class NumberBagTester {
	public static void main(String[] args) {
		NumberBag b = new NumberBag(100);

		b.add(3);
		b.add(3);
		b.add(5);

		System.out.println("There are: " + b.getFreqFor(3) + " 3's");
	}
}
